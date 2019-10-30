package core.chapter03._6._1;

import org.springframework.format.datetime.DateFormatter;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * DateFormatter实例
 */
public class DateFormatterExample {
    public static void main(String[] args) throws ParseException {
        DateFormatter formatter = new DateFormatter();
        Date parse = formatter.parse("1999-12-30", Locale.CHINA);
        System.out.println(parse);
        String print = formatter.print(new Date(), Locale.CHINA);
        System.out.println(print);
    }
}
