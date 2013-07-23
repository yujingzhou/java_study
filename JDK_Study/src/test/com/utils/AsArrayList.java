package test.com.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsArrayList {

    /**
     * @param args
     */
    public static void main(String[] args) {
//        Integer []a = new Integer[]{11, 22};
//        
//        List <Integer> list = new ArrayList<Integer>(Arrays.asList(a));
//        list.add(0);
        
        int []temp = {1,6,3,0};
        Arrays.sort(temp);
        
        System.out.println(Arrays.binarySearch(temp, 3));
        
        
    }

}
