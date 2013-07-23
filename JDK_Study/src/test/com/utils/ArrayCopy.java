package test.com.utils;

public class ArrayCopy {
    
    public static void main(String[] args) {
        int []a = new int[10];
        for (int i=0;i<a.length;i++) {
            a[i] = i;
        }
        
        int []b = new int[11];
        System.arraycopy(a, 0, b, 0, 2);
        
        for (Integer integer : b) {
            System.out.println(integer);
        }
        
    }

}
