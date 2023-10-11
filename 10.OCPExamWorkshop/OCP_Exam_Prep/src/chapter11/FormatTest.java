package chapter11;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Locale.Category;
import java.util.stream.Stream;

import static java.time.format.FormatStyle.SHORT;


public class FormatTest {
    public static void main(String[] args) {
//        double d = 1234.567;
//        NumberFormat f1 = new DecimalFormat("###,###,###.0");
//        System.out.println(f1.format(d));
//
//        NumberFormat f2 = new DecimalFormat("000,000,000.0000");
//        System.out.println(f2.format(d));
//
//        NumberFormat f3 = new DecimalFormat("Your balance: $#,###,###.##");
//        System.out.println(f2.format(d));

//        LocalDate date = LocalDate.of(2022, Month.OCTOBER, 20);
//        System.out.println(date.getDayOfWeek()); // THURSDAY
//        System.out.println(date.getMonth()); // OCTOBER
//        System.out.println(date.getYear()); // 2022
//        System.out.println(date.getDayOfYear());

//        LocalDate date = LocalDate.of(2022, Month.OCTOBER, 20);
//        LocalTime time = LocalTime.of(11, 12, 34);
//        LocalDateTime dt = LocalDateTime.of(date, time);
//
//        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
//        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
//        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

//        date.format(DateTimeFormatter.ISO_LOCAL_TIME); // RuntimeException
//        time.format(DateTimeFormatter.ISO_LOCAL_DATE); // RuntimeException

//        var f = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' hh:mm");
//        System.out.println(dt.format(f)); // October 20, 2022 at 11:12

//        var formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
//        System.out.println(dt.format(formatter1)); // 10/20/2022 06:15:30

//        var formatter2 = DateTimeFormatter.ofPattern("MM_yyyy_-_dd");
//        System.out.println(dt.format(formatter2)); // 10_2022_-_20

//        var formatter2 = DateTimeFormatter.ofPattern("MM_yyyy_-_dd");
//        System.out.println(dt.format(formatter2)); // 10_2022_-_20

//        var formatter3 = DateTimeFormatter.ofPattern("h:mm z");
//        System.out.println(dt.format(formatter3)); // DateTimeException
//
//        var dateTime = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);
//        var formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
//
//        System.out.println(dateTime.format(formatter)); // 10/20/2022 06:15:30
//        System.out.println(formatter.format(dateTime)); // 10/20/2022 06:15:30

//        var f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy ");
//        var f2 = DateTimeFormatter.ofPattern(" hh:mm");
//        System.out.println(dt.format(f1) + "at" + dt.format(f2));

//        var g1 = DateTimeFormatter.ofPattern("MMMM dd', Party''s at' hh:mm");
//        System.out.println(dt.format(g1)); // October 20, Party's at 06:15
//
//        var g2 = DateTimeFormatter.ofPattern("'System format, hh:mm: 'hh:mm");
//        System.out.println(dt.format(g2)); // System format, hh:mm: 06:15
//
//        var g3 = DateTimeFormatter.ofPattern("'NEW! 'yyyy', yay!'");
//        System.out.println(dt.format(g3)); // NEW! 2022, yay!

//        DateTimeFormatter.ofPattern("The time is hh:mm"); // Exception thrown
//
//        DateTimeFormatter.ofPattern("'Time is: hh:mm: "); // Exception thrown

//        System.out.println(Locale.GERMAN); // de
//        System.out.println(Locale.GERMANY); // de_DE
//
//        System.out.println(new Locale("fr")); // fr
//        System.out.println(new Locale("hi", "IN")); // hi_IN

//        Locale l1 = new Locale.Builder()
//                .setLanguage("en")
//                .setRegion("US")
//                .build();
//        Locale l2 = new Locale.Builder()
//                .setRegion("US")
//                .setLanguage("en")
//                .build();
//
//        System.out.println(l1);
//        System.out.println(l2);

//        double price = 48;
//        var myLocale = NumberFormat.getCurrencyInstance();
//        System.out.println(myLocale.format(price));
//
//        var germLocale = NumberFormat.getCurrencyInstance(Locale.GERMANY);
//        System.out.println(germLocale.format(price));
//
//        var canLocale = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
//        System.out.println(canLocale.format(price));

//        double successRate = 0.802;
//        var us = NumberFormat.getPercentInstance(Locale.US);
//        System.out.println(us.format(successRate)); // 80%
//
//        var gr = NumberFormat.getPercentInstance(Locale.GERMANY);
//        System.out.println(gr.format(successRate)); // 80 %

//        try {
//            String s = "40.45";
//            var en = NumberFormat.getInstance(Locale.US);
//            System.out.println(en.parse(s)); // 40.45
//            var fr = NumberFormat.getInstance(Locale.FRANCE);
//            System.out.println(fr.parse(s)); // 40
//        } catch (ParseException e) {
//            System.out.println(e);
//        }

//        try {
//            String income = "$92,807.99";
//            var cf = NumberFormat.getCurrencyInstance(Locale.US);
//            double value = (Double) cf.parse(income);
//            System.out.println(value); // 92807.99
//        } catch (ParseException e) {
//            System.out.println(e);
//        }

//        var formatters = Stream.of(
//                NumberFormat.getCompactNumberInstance(),
//                NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.SHORT),
//                NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.LONG),
//                NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.SHORT),
//                NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.LONG),
//                NumberFormat.getNumberInstance());
//        formatters.map(s -> s.format(7_123_456)).forEach(System.out::println);

//        Locale.setDefault(new Locale("en", "US"));
//        var italy = new Locale("it", "IT");
//        var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 15, 12, 34);
//        // 10/20/22 --- 20/10/22
//        print(DateTimeFormatter.ofLocalizedDate(SHORT), dt, italy);
//        // 3:12 PM --- 15:12
//        print(DateTimeFormatter.ofLocalizedTime(SHORT), dt, italy);
//        // 10/20/22, 3:12 PM --- 20/10/22, 15:12
//        print(DateTimeFormatter.ofLocalizedDateTime(SHORT, SHORT), dt, italy);
//    }

//    public static void print(DateTimeFormatter dtf,
//                             LocalDateTime dateTime, Locale locale) {
//        System.out.println(dtf.format(dateTime) + " --- "
//                + dtf.withLocale(locale).format(dateTime));
//    }

        var spain = new Locale("es", "ES");
        var money = 1.23;
        // Print with default locale
        Locale.setDefault(new Locale("en", "US"));
        printCurrency(spain, money); // $1.23, Spanish

        // Print with selected locale display
        Locale.setDefault(Category.DISPLAY, spain);
        printCurrency(spain, money); // $1.23, español

        // Print with selected locale format
        Locale.setDefault(Category.FORMAT, spain);
        printCurrency(spain, money); // 1,23 €, español
    }

    public static void printCurrency(Locale locale, double money) {
        System.out.println(
                NumberFormat.getCurrencyInstance().format(money)
                        + ", " + locale.getDisplayLanguage());
    }
}

