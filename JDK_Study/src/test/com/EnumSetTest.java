package test.com;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetTest {

    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}
    public void applyStyles(Set<Style> styles){
        for (Style style : styles) {
            System.out.println(style);
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        EnumSetTest est = new EnumSetTest();
        est.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC, Style.STRIKETHROUGH));
    }

}
