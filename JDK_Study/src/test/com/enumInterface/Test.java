package test.com.enumInterface;

import java.util.Arrays;
import java.util.Collection;

public class Test {
    
    public static void main(String[] args) {
        double x = 1;
        double y = 2;
        test(BasicOperation.class, x, y);
        test(Arrays.asList(ExtendedOperation.values()), x , y);
    }
    
    //这个真的得好好理解啊
    private static <T extends Enum<T> & Operation> void test(Class<T> opSet, double x, double y){
        for (Operation op : opSet.getEnumConstants()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }
    
    private static void test(Collection<? extends Operation> opSet, double x, double y){
        for (Operation op : opSet) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }
}
