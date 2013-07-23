package test.com.joy;

import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

public class LastTime {
    public static void main(String[] args) {
        long t = TimeUnit.DAYS.toSeconds(27) + TimeUnit.HOURS.toSeconds(11);
        long year = TimeUnit.DAYS.toSeconds(366);
        
        System.out.println(new DecimalFormat("#.####%").format((double)t/(double)year));
        System.out.println(new DecimalFormat("#.####%").format(10.2346));
    }
}
