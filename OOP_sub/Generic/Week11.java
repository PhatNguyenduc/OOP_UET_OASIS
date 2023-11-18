import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Week11<T extends Comparable<T>> {
    /**
     * .
     * @param list a list
     * @return sorted list
     */

    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        int s = list.size();
        for (int i = 0; i < s; i++) {
            for (int j = i; j < s; j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    T temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

}

