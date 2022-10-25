/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */
import java.time.*;
import java.time.format.*;

class DateTimeTest {

    /**
     * main() calls each of the test methods in turn (currently commented out).
     * To run one test method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) {
         testNow();
         testCreate();
         testParse();
         testFormat();
    }

    /**
     * TASK: create current date, time, and date-time via now() and then print them.
     */
    public static void testNow() {
        // TODO
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }

    /**
     * TASK: implement the TODOs and print your results.
     */
    public static void testCreate() {
        // TODO: create your birthday via of(). What day of the week were you born on?
        LocalDate birthday = LocalDate.of(1993, 06, 27);
        DayOfWeek birthdayDayOfWeek = birthday.getDayOfWeek();
        System.out.println(birthdayDayOfWeek);
        // TODO: use of() to create a value representing the 1st lunar landing - it happened on 7/20/69 at 3:18pm Eastern Time.
        // NOTE: ignore time-zone, just assume Eastern Time is the local time.
        LocalDate moonLanding = LocalDate.of(1969, 7, 20);
        String displayMoonLanding = moonLanding.format(DateTimeFormatter.ofPattern("EEE, d MMM, yyyy"));
        System.out.println(displayMoonLanding);
    }

    /**
     * TASK: implement the TODOs and print your results.
     */
    public static void testParse() {
        // TODO: create your birthday by parsing a text representation in standard format ("yyyy-MM-dd").
        DateTimeFormatter dateTimeFormatterBirthday = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthdayFormatted = LocalDate.parse("27-06-1993", dateTimeFormatterBirthday);
        System.out.println(birthdayFormatted);
        // OPTIONAL: now create it by parsing text in the form "2/6/2014" (this is Feb 6, not Jun 2).
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate formatted = LocalDate.parse("06-02-2014", dateTimeFormatter);
        System.out.println(formatted);
    }

    /**
     * TASK: create formatted display strings for the date below, in the specified formats.
     */
    public static void testFormat() {
        //LocalDate hastings = LocalDate.of(1066, 10, 14);
        DateTimeFormatter hastingsDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate formattedHastings = LocalDate.parse("1066-10-14", hastingsDateTimeFormatter);
        System.out.println(formattedHastings);
        // TODO: 10/14/1066
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate formatted1 = LocalDate.parse("10/14/1066", dateTimeFormatter1);
        System.out.println(formatted1);
        // TODO: 14-10-1066
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate formatted2 = LocalDate.parse("14/10/1066", dateTimeFormatter2);
        System.out.println(formatted2);
//        LocalDate dateTimeFormatter2Test = LocalDate.of(14, 10, 1066);
//        String formatted2TestDisplay = dateTimeFormatter2Test.format(ofPattern("dd/MM/yyy"));
//        System.out.println(formatted2TestDisplay);
        // OPTIONAL: October 14, 1066
    }
}