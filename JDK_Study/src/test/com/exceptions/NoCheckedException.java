package test.com.exceptions;

public class NoCheckedException {

    public void test() throws ArithmeticException {
        throw new RuntimeException("必须得痛苦！不然报错！");// 非受检异常 代
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            new NoCheckedException().test();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("不处理，是不能运行的！");

    }

}
