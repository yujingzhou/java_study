package test.com;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {
    
    public static void main(String[] args) {
        int[] a = {1, 8, 3, -2};
        Arrays.sort(a, 0, 3);
        for (int i : a) {
            System.out.println(i);
        }
        
        String[] temp = {"adsf", "dfddff", "a"};
        //倒排序
        Arrays.sort(temp, new Comparator<String>(){
            public int compare(String s1, String s2){
                return s2.length() - s1.length();
            }
        });
        for (String string : temp) {
            System.out.println(string);
        }
    }
}
