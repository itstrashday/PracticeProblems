package com.company.Easy.Numbers;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar) {

        // blow out only the tallest candles.. aka biggest #'s. ex. {4, 4, 2, 0, 4} / blowout 3 candles
        int tallestCandle = ar[0];
        int totalCandlesToBlow = 1;

        for (int i = 1; i < ar.length; i++) {
            if(ar[i] > tallestCandle) {
                totalCandlesToBlow = 1;
                tallestCandle = ar[i];
            } else if (ar[i] == tallestCandle) {
                totalCandlesToBlow++;
            }
        }
        return totalCandlesToBlow;
    }
}
