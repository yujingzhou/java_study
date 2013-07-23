package test.com.utils;

import java.util.Locale;

public class LocalTest {
    
    
    public static void main(String[] args) {
        Locale l = Locale.SIMPLIFIED_CHINESE;
        System.out.println(l.getCountry());
        System.out.println(Locale.getDefault().getCountry());
    }
}
