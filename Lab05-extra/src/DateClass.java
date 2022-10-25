import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;

public class DateClass {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Date now: " + now);
        LocalDate theDayAfterTomorrow = now.plusDays(2);
        System.out.println("The day after tomorrow: " + theDayAfterTomorrow);
        LocalDate localDate = LocalDate.of(2016, Month.AUGUST, 23);
        System.out.println("Localdate: " + localDate);

        System.out.println();

        LocalTime localTime = LocalTime.now();
        System.out.println("Local time: " + localTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned Date Time: " + zonedDateTime);

        System.out.println();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate localDate1 = LocalDate.parse("20-Jan-2020", dateTimeFormatter);
        System.out.println(localDate1);
        LocalDate localDate2 = localDate.of(2020, 10, 18);
        String format = localDate2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(format);
        LocalDate moonLanding = LocalDate.of(1969, 7, 20);
        String display = moonLanding.format(DateTimeFormatter.ofPattern("EEE, d MMM, yyyy"));
        System.out.println(display);

        //LocalTime end = LocalTime.of(13,30);
        //String displayTime = end.format(ofPattern("h:mm a"));
        //System.out.println(displayTime);

        System.out.println();

        LocalDate localDate3 = localDate.of(2022, 10, 18);
        int dayOfMonth = localDate3.getDayOfMonth();
        Month month = localDate3.getMonth();
        int monthValue = localDate3.getMonthValue();
        DayOfWeek dayOfWeek = localDate3.getDayOfWeek();
        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(monthValue);
        System.out.println(dayOfWeek);

        System.out.println();

        int ii = localDate.get(ChronoField.DAY_OF_WEEK);
        System.out.println(ii);

        System.out.println();

        LocalDate today = LocalDate.now();
        LocalDate today3000 = today.withYear(3000);
        LocalDate first = today.withDayOfMonth(1);
        System.out.println(today3000);
        System.out.println(first);
        LocalTime now1 = LocalTime.now();
        LocalTime nowSimple = now1.withNano(0);
        System.out.println(nowSimple);

        System.out.println();

//        LocalDate nowTemporalAdjuster = LocalDate.now();
//        LocalDate nextSunday = nowTemporalAdjuster.with(next(DayOfWeek.SUNDAY));
//        System.out.println(nextSunday);

        LocalDate nowPeriod = LocalDate.now();
        LocalDate p1Y2M3D = nowPeriod.plus(Period.parse("P1Y2M3D"));
        System.out.println(p1Y2M3D);

        ZonedDateTime la = ZonedDateTime.of(LocalDateTime.of(2022, 10, 18, 3,25), ZoneId.of("America/Los_Angeles"));
        System.out.println(la);
        ZonedDateTime nz = la.withZoneSameInstant(ZoneId.of("NZ"));
        System.out.println(nz);
    }
}
