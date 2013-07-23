package test.com.joy;

interface Parent {
    public static int i = 5;

}

class Child implements Parent {
    public static int j = 6;
    static{
        System.out.println("c");
    }
}

public class ClassInit {

    /**
     * @param args
     */
    public static void main(String[] args) {
//        Parent p = new Child();
//        System.out.println(p.i); //p c 6
//        
//        Parent p1 = new Parent();
//        System.out.println(p1.i);//p 5
        
        System.out.println(Child.i);//p 5
        
//        System.out.println(Child.j);// p c 6
        
        //ns 级别的访问时间，返回的是随机时间
        System.out.println(System.nanoTime());
        //自1970-1-1UTC到当前时间为止的，以毫秒为单位的时间
        System.out.println(System.currentTimeMillis());

    }

}

