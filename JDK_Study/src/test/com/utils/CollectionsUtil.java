package test.com.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionsUtil {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Collection<String> c1 = new LinkedList<String>();
        c1.add("aa");
        c1.add("cc");
        c1.add("bb");
        c1.add("aa");
        Collection<String> c2 = new HashSet<String>();
        c2.add("aa");
        c2.add("cc");
        c2.add("bb");
        c2.add("aa");
        // sort test
        Collections.sort((List<String>)c1);
        List<String>temp = (List<String>)c1;
        ListIterator<String> listi = temp.listIterator();
        while (listi.hasNext()) {
            System.out.println(listi.next());
        }
        Collections.swap(temp, 0, 3);
        ListIterator<String> listi1 = temp.listIterator();
        while (listi1.hasNext()) {
            System.out.println(listi1.next());
        }
        //frequency
        System.out.println(Collections.frequency(c1, "aa"));
        //disjoint
        System.out.println(Collections.disjoint(c1, c2));
        //max
        System.out.println(Collections.max(c1));
        //min
        System.out.println(Collections.min(c1));
        //empty
        c1 = (List<String>)Collections.EMPTY_LIST;
        System.out.println(c1);
        c1 = new LinkedList<String>();
        c1.add("aa");
        c1.add("cc");
        c1.add("bb");
        c1.add("aa");
        List<String> c3 = new LinkedList<String>();
        c3.add("");
        c3.add("");
        c3.add("");
        c3.add("");
        Collections.fill(c3, "a");
        for (String string : c3) {
            System.out.println(string);
        }
        System.out.println(c1.size());
        System.out.println(c3.size());
        //copy
        Collections.copy(c3, (List<String>)c1);
        ListIterator<String> listi3 = c3.listIterator();
        while (listi3.hasNext()) {
            System.out.println(listi3.next());
        }
    }

}
