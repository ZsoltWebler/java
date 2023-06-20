package org.webler.zsolt;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class DateDemo {

    public static void dateDemo() {

        /* LocalDate, amikor csak a dátum számít, időzóna nélkül
         * (yyyy-MM-dd) ISO
         * */
        LocalDate localDate = LocalDate.now();
        localDate = LocalDate.of(2015, 2, 20);
        localDate = LocalDate.parse("2015-02-20");

        System.out.println(localDate);

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(previousMonthSameDay);

        DayOfWeek today = LocalDate.now().getDayOfWeek();
        System.out.println(today);
        int todayInt = LocalDate.now().getDayOfMonth();
        System.out.println(todayInt);

        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println(leapYear);

        boolean notBefore = LocalDate.parse("2016-06-12")
                .isBefore(LocalDate.parse("2016-06-11"));
        System.out.println(notBefore);

        boolean isAfter = LocalDate.parse("2016-06-12")
                .isAfter(LocalDate.parse("2016-06-11"));
        System.out.println(isAfter);

        // ===================================================================

        /*
         * LocalTime az idő tárolására
         * */
        LocalTime now = LocalTime.now();
        now = LocalTime.of(6, 30);
        now = LocalTime.parse("06:30");
        System.out.println(now);

        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
        int six = LocalTime.parse("06:30").getHour();
        boolean isBefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));

        // ===================================================================

        /*
        * LocalDateTime dátum + idő
        * */
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        LocalDateTime.parse("2015-02-20T06:30:00");
        localDateTime.plusDays(1);
        localDateTime.minusHours(2);
        localDateTime.getMonth();

        // ===================================================================

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");
        ZoneOffset offset = ZoneOffset.of("+02:00");

        OffsetDateTime offSetByTwo = OffsetDateTime
                .of(localDateTime, offset);
    }

    /**
     * Nézzétek meg, milyen napra esik a születésnapotok 2050-ben.
     * */


}
