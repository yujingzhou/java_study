package test.com.utils;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("a");
        v.add("b");
        for (Enumeration<String> e = v.elements(); e.hasMoreElements();)
            System.out.println(e.nextElement());
    }
}
