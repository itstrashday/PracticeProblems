package com.Hackerrank.Easy.DatesTimes;

import java.time.LocalDate;

public class DateAndTme {

    /*
    * Find the day of the week from a given date.
    * - MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY -
    * */
    public static String findDay(int month, int day, int year) {
        return java.time.format.DateTimeFormatter.ofPattern("EEEE").format(LocalDate.of(year, month, day)).toUpperCase();
    }
}
