package test.com;



import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    
    enum State {
        SUCCESS, FAILED
    }
    
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(254573048808717L);
        System.out.println("由long得到的某个时间：\t" + sdf.format(date));
        //当前时间
        long nowLong = System.currentTimeMillis();
        System.out.println("当前时间的long值：\t" + nowLong);
        Date now = new Date(nowLong);
        System.out.println("当前时间：\t\t" + sdf.format(now));
        
        //10分钟前
        long tenAgoLong = nowLong - 10*60*1000L;
        System.out.println("十分钟前时间long值：\t" + tenAgoLong);
        Date tenAgo = new Date(tenAgoLong);
        System.out.println("十分钟前：\t\t" + sdf.format(tenAgo));
        System.out.println("10.3.23.21：7477".split(":")[0]);
    }
    
    public static void testBase64(String origin){
        System.out.println(com.sun.org.apache.xerces.internal.impl.dv.util.Base64.encode(origin.getBytes()));
    }
}
