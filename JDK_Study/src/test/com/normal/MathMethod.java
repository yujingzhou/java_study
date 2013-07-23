package test.com.normal;

import java.math.BigDecimal;

public class MathMethod {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //二进制浮点运算
        System.out.println(1.03-.42);
        //BigDecimal
        BigDecimal bd = new BigDecimal(1.03);
        BigDecimal bdl = new BigDecimal(0.42);
        System.out.println(bd.subtract(bdl));
        //long
        long l = (long) 1.03;
        long l1 = (long) 0.42;
        System.out.println(l - l1);
        //float除以0不抛异常
        float i = (float)100.00/0;
        System.out.println(i);
    }

}
