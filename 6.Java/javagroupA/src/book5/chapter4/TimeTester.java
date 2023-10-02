package book5.chapter4;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class TimeTester {
    public static void main(String[] args) {
//        System.out.println("\nLocalTime: " + LocalTime.now().toString());
//        System.out.println("\nLocalDateTime: " + LocalDateTime.now().toString());
//        System.out.println("\nZoneDateTime: " + ZonedDateTime.now().toString());
//        System.out.println("\nOffsetTime: " + OffsetTime.now().toString());
//        System.out.println("\nOffsetDateTime: " + OffsetDateTime.now().toString());
//        System.out.println("\nMonthDay: " + MonthDay.now().toString());
//        System.out.println("\nYearMonth: " + YearMonth.now().toString());
//        System.out.println("\nInstant: " + Instant.now().toString());
//        LocalDate d = LocalDate.parse("2014-12-15");
//        System.out.println(d);
//        try {
//            LocalDateTime d = LocalDateTime.parse("2014-12-15T1");
//            System.out.println(d);
//        } catch (DateTimeParseException e) {
//            System.out.println(e.getLocalizedMessage());
//        }
//        LocalDate date = LocalDate.of(2023,9,4);
//        System.out.println(date);
//        LocalDate date = LocalDate.of(2023, Month.SEPTEMBER, 4);
//        System.out.println(date);
//        for (String id : ZoneId.getAvailableZoneIds())
//            System.out.println(id);
//        ZoneId z = ZoneId.of("America/Los_Angeles");
//        ZonedDateTime zdate;
//        zdate = ZonedDateTime.of(2014, 12, 15, 0, 0, 0, 0, z);
//        zdate = ZonedDateTime.of(2014, 12, 15, 0, 0, 0, 0,
//                ZoneId.of("America/Los_Angeles"));
//        System.out.println(zdate);
//        ZoneOffset z = ZoneOffset.ofHours(-8);
//        OffsetTime o = OffsetTime.of(12,30,0,0,zo);
//        System.out.println(o);
//        ZoneOffset zo = ZoneOffset.of("-08:00");
//        OffsetTime o = OffsetTime.of(12,30,0,0,zo);
//        System.out.println(0);
//        LocalDate date = LocalDate.now();
//        System.out.println(date.getYear());
//        System.out.println(date.getMonthValue());
//        System.out.println(date.getDayOfMonth());
//        System.out.println(date.getDayOfYear());
//        if (LocalDate.now() == LocalDate.now()) {
//            System.out.println("All is right in the universe!");
//        } else {
//            System.out.println("Something is wrong in the universe!");
//        }
//        if (LocalDate.now().equals(LocalDate.now())) {
//            System.out.println("All is right in the universe!");
//        } else {
//            System.out.println("Something is wrong in the universe!");
//        }
//        if (LocalDate.now().getDayOfMonth() < 15)
//            System.out.println("It is not yet the 15th.");
//        System.out.println("Today's date is " + LocalDate.now());
//        System.out.println("Tomorrow is " + LocalDate.now().plusDays(1));
//        System.out.println("Next week's date is " + LocalDate.now().plusWeeks(1));
//        System.out.println("Next Month's date is " + LocalDate.now().plusMonths(1));
//        System.out.println("Next Year's date is " + LocalDate.now().plusYears(1));
//        LocalDate date1 = LocalDate.parse("2023-09-04");
//        LocalDate date2 = LocalDate.parse("2024-07-25");
//        System.out.println(date1.until(date2, ChronoUnit.DAYS));
//        LocalDate today = LocalDate.now();
//        LocalDate invDate = LocalDate.of(today.getYear(),
//                today.getMonthValue(), 15);
//        if (today.getDayOfMonth() > 15)
//            invDate = invDate.plusMonths(1);
//        long daysToInvoice = today.until(invDate,
//                ChronoUnit.DAYS);
//        System.out.println(daysToInvoice
//                + " until next invoice date.");
//        DateTimeFormatter formatter;
//        formatter = DateTimeFormatter.ofPattern("dd MMM YYYY");
//        LocalDate date = LocalDate.now();
//        System.out.println(date.format(formatter));

        LocalDateTime now = LocalDateTime.now();
        printDate(now, "YYYY-MM-dd");
        printDate(now, "MM-dd-YYYY");
        printDate(now, "dd MMM YYYY");
        printDate(now, "MMMM d, YYYY");
        printDate(now, "HH:mm");
        printDate(now, "h:mm a");
    }
        public static void printDate(LocalDateTime date, String pattern)
        {
            DateTimeFormatter f;
            f = DateTimeFormatter.ofPattern(pattern);
            pattern = (pattern + "          ").substring(0, 14);
            System.out.println(pattern + " " + date.format(f));
        }
    }
//    }
//}
