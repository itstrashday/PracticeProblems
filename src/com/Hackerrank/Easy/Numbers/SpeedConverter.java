package com.Hackerrank.Easy.Numbers;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {

        String kph = kilometersPerHour + " km/h";
        long conv = toMilesPerHour(kilometersPerHour);
        String mph = " mi/h";

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kph + " = " + conv + mph);
        }
    }
}
