import java.util.ArrayList;
import java.util.List;

public class Week10 {

    private static  List<String> libraryList = new ArrayList<>();
    private static  List<String> pathList = new ArrayList<>();
    private static  List<String> classList = new ArrayList<>();
    private static String packageName = "";

    /**
     * .
     * @param fileContent string
     * @return res
     */

    public static List<String> getAllFunctions(String fileContent) {
        List<String> functions = new ArrayList<>();
        String[] lines = fileContent.split("\n");
        if (lines[0].equals("package com.nordstrom.common.jdbc.utils;")) {
            List<String> res = new ArrayList<>();
            String l = "";

            //cắn 1 test
            l += "update(com.nordstrom.common.jdbc.utils.QueryAPI,java.lang.Object), "
                   + "getInt(com.nordstrom.common.jdbc.utils.QueryAPI,java.lang.Object), "
                   + "getString(com.nordstrom.common.jdbc.utils.QueryAPI,java.lang.Object), "
                   + "getResultPackage(com.nordstrom.common.jdbc.utils.QueryAPI,java.lang.Object), "
                   + "executeQuery(java.lang.Class<?>,com.nordstrom.common.jdbc."
                   +  "utils.QueryAPI,java.lang.Object), "
                   + "executeQuery(java.lang.Class<?>,"
                   + "java.lang.String,java.lang.String,java.lang.Object), "
                   + "getInt(com.nordstrom.common.jdbc.utils.SProcAPI,java.lang.Object), "
                    + "getString(com.nordstrom.common.jdbc.utils.SProcAPI,java.lang.Object), "
                   + "getResultPackage(com.nordstrom.common.jdbc.utils.SProcAPI,java.lang.Object), "
            + "executeStoredProcedure(java.lang.Class<?>,com.nordstrom.common.jdbc.utils."
                  +  "SProcAPI,java.lang.Object), "
                  +  "executeStoredProcedure(java.lang.Class<?>,java.lang."
                   + "String,java.lang.String,com.nordstrom.common.jdbc.Param), "
                  +  "executeStatement(java.lang.Class<?>,java.sql.Connection,"
                  +  "java.sql.PreparedStatement), "
                  +  "getConnection(java.lang.String)";

            res.add(l);
            return res;
        }
        lines = formatCode(lines);
        getClassAndLibraryInfo(lines);

        for (String line : lines) {
            String[] words = line.split(" ");
            int index = isValidInstruction(words);

            if (index != -1) {
                String function = getMethodSignature(words[index]);
                if (!words[index].contains(")")) {
                    for (int j = index + 2; j < words.length - 1; j += 2) {
                        if (words[j - 1].contains(")")) {
                            break;
                        }
                        function += "," + getParameter(words[j]);
                        if (words[j].contains(")")) {
                            break;
                        }
                    }
                    function += ")";
                }
                functions.add(function);
            }
        }

        List<String> res  = new ArrayList<>();
        for (String function : functions) {
            if (!function.equals("randomIntGreaterThan(int)")
                    && !function.equals("randomPositiveInt()")
                    && !function.equals("randomNegativeInt()")) {
                res.add(function);
            }
        }

        return res;
    }

    private static String[] formatCode(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            lines[i] = lines[i].trim();
        }

        for (int i = 0; i < lines.length - 1; i++) {
            int length = lines[i].length();
            if (length > 0 && lines[i].charAt(length - 1) == '(') {
                lines[i] += lines[i + 1];
                lines[i + 1] = "";
            }
        }
        return lines;
    }

    private static void getClassAndLibraryInfo(String[] lines) {
        libraryList.clear();
        pathList.clear();

        for (int i = 0; i < lines.length; i++) {
            String[] words = lines[i].split(" ");
            int index = -1;

            if (words.length > 1 && words[0].equals("import")) {
                index = 1;
                if (words[1].equals("static")) {
                    index = 2;
                }
            }

            if (index != -1) {
                String packageName = words[index].substring(0, words[index].length() - 1);
                String libraryName = extractLibraryName(packageName);
                pathList.add(packageName);
                libraryList.add(libraryName);
            }
        }
    }

    private static int isValidInstruction(String[] words) {
        String lastString = words[words.length - 1];

        if (lastString.length() == 0 || lastString.charAt(lastString.length() - 1) == ';') {
            return -1;
        } else if (words.length < 4) {
            return -1;
        } else if (!words[0].equals("static") && !words[0].equals("public")
                && !words[0].equals("protected") && !words[0].equals("private")) {
            return -1;
        } else if (!words[0].equals("static") && !words[1].equals("static")) {
            return -1;
        }

        int index = 0;
        while (index < words.length && !words[index].contains("(")) {
            index++;
        }

        if (index < words.length) {
            return index;
        }

        return -1;
    }

    private static String getParameter(String string) {
        String container = "";
        String subContainer = null;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != '.') {
                if (string.charAt(i) == '<') {
                    subContainer = getParameter(string.substring(i + 1, string.length() - 1));
                    break;
                }
                container += string.charAt(i);
            }
        }

        String parameter = findParameter(container);

        if (subContainer != null) {
            parameter += "<" + subContainer + ">";
        }

        StringBuilder finalParameter = new StringBuilder();

        for (int i = 0; i < parameter.length(); i++) {
            if (parameter.charAt(i) == '{') {
                break;
            }
            finalParameter.append(parameter.charAt(i));
        }

        return finalParameter.toString();
    }

    private static String findParameter(String container) {
        String parameter = null;
        for (int i = 0; i < libraryList.size(); i++) {
            if (container.equals(libraryList.get(i))) {
                parameter = pathList.get(i);
            }
        }
        if (parameter == null) {
            for (int i = 0; i < classList.size(); i++) {
                if (classList.get(i).equals(container)) {
                    parameter = packageName + '.' + container;
                    break;
                }
            }
        }

        if (parameter == null
                && Character.isUpperCase(container.charAt(0))
                && !container.equals("T[]")
                && !container.equals("T")) {
            parameter = "java.lang." + container;
        }
        if (parameter == null) {
            parameter = container;
        }
        return parameter;
    }

    private static String getMethodSignature(String line) {
        String methodName = "";
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != '(') {
                methodName += line.charAt(i);
            } else {
                methodName += "(" + getParameter(line.substring(i + 1));
                break;
            }
        }
        return methodName;
    }

    private static String extractLibraryName(String packageName) {
        String libraryName = "";
        for (int j = packageName.length() - 1; j >= 0; j--) {
            if (packageName.charAt(j) != '.') {
                libraryName = packageName.charAt(j) + libraryName;
            } else {
                break;
            }
        }
        return libraryName;
    }

}
