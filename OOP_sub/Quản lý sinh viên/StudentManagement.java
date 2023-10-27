import  java.util.*;
import java.lang.*;
public class StudentManagement {

    // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100)
    public List<Student> students = new ArrayList<Student>();
    public static boolean sameGroup(Student s1, Student s2) {
        if(s1.getGroup() == s2.getGroup())return true;
        else
            return false; // xoa dong nay sau khi cai dat
    }

    public void addStudent(Student newStudent) {
        // TODO:
        students.add(newStudent);
    }

    public String studentsByGroup() {
        // TODO:
        String res = "";
        Set<String> groups = new LinkedHashSet<String>();
        for (int i = 0 ; i < students.size() ; i++) {
            groups.add(students.get(i).getGroup());
        }
        for(String x : groups) {
            res += x +"\n";
            for (int i = 0 ; i <students.size(); i++) {
                if(students.get(i).getGroup() == x) {
                    res += students.get(i).getInfo() +"\n";
                }
            }

        }
        return res;

    }

    public void removeStudent(String id) {
        for(int i = 0 ; i <students.size() ; i++) {
            if(students.get(i).getId() == id) {
                students.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        // TODO
        Student s = new Student("Nguyen Van An","17020001","uet.vnu.edu.vn");
        s.setGroup("K62CC");
        String result = s.getInfo();
        System.out.println(result);





    }
}