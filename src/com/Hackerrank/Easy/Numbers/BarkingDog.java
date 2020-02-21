package com.Hackerrank.Easy.Numbers;

public class BarkingDog {

    // if the dog barks between 22 and 8 hundred hours. wake up
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay >= 0 && hourOfDay <= 23) {
            if (hourOfDay < 8 || hourOfDay > 22) {
                if (barking) {
                    System.out.println("True");
                    return true;
                }
            }
        }
        System.out.println("False");
        return false;
    }
}
