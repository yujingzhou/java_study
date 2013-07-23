package test.com.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysUtil {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int []temp = {1,36,5};
        // sort test
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
        
        int []temp1 = {4, 8,25, 4, 7};
        // binarySearch
        Arrays.sort(temp1);
        System.out.println(Arrays.toString(temp1));
        System.out.println(Arrays.binarySearch(temp1, 8));
        
        //数组与集合的区别
        int []temp2 = new int[10];
        List<Integer> list = new ArrayList<Integer>(10);
        System.out.println(temp2.length);
        System.out.println(list.size());
    }

}
