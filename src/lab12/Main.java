package lab12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "(\\d+\\.\\d{2} (USD|UA|RUB))";
        String s = "24.34 USD 128.376 RUB 244 EURO 55 UA";
        Pattern p1 = Pattern. compile(regex);
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            System.out.println("Список цен: " + m1.group());}
    }
}
