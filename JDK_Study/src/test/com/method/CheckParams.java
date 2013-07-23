package test.com.method;

public class CheckParams {

    
    private void equals(int a, String b){
        
        assert a > 0:"a must larger than 0";
        System.out.println(a);
        System.out.println(a > 0);
        assert b != null:"b must not be null";
        
        System.out.println("可以运行");
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        CheckParams cp = new CheckParams();
        cp.equals(-8, null);
    }

}
