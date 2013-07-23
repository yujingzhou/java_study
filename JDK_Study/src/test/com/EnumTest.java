package test.com;

public class EnumTest {
    
    public enum Apple {FUJI, PIPPIN, GRANNY_SMITH}
    public enum Orange {NAVEL, TEMPLE, BLOOD}
    public static void main(String[] args) {
        //enum就是一个class
        Apple temp = Apple.FUJI;
        System.out.println(Apple.FUJI.toString());
        EnumTest et = new EnumTest();
        //类型安全的枚举
        et.test(temp);
        //输出FUJI的ordinal
        System.out.println(Apple.FUJI.ordinal());
        //使用printf输出
        System.out.printf("This apple is %s %s%n", temp, temp);
        //输出所有的Apple
        for (Apple a : Apple.values()) {
            System.out.println(a);
        }
    }
    
    public void test(Apple temp){
        System.out.println(temp);
    }

}
