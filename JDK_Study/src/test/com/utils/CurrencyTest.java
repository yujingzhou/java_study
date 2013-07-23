package test.com.utils;

import java.util.Currency;

public class CurrencyTest {
    public static void main(String[] args) {
        Currency c = Currency.getInstance("CNY");
        
        //￥货币前缀
        System.out.println(c.getSymbol());
        //编码
        System.out.println(c.getCurrencyCode());
        //小数位数
        System.out.println(c.getDefaultFractionDigits());
    }
}
