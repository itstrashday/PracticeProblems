package com.Hackerrank.Easy.Numbers;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (year % 4 != 0) {
                return false;
            } else if (year % 400 == 0) {
                return true;
            } else return year % 100 != 0;
        }
        return false;
    }
}
