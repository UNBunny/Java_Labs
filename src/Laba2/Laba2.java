package Laba2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laba2 {
    public static void var11() {
        String text = "Текст с ценами: 23.78 USD, 100 RUR, 50.25 EU, 9.99 GBP";
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?\\s?(USD|RUR|EU)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
