package com.Hackerrank.Easy.Numbers;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2){

        if (d1 == d2) {
            System.out.println("d1 == d2");
            return true;
        }
        System.out.println("not equal");
        return false;
    }
}
