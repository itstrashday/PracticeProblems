package com.company.Easy.Numbers;

public class VeryBigSum {

    static long aVeryBigSum(long[] ar) {
        long sum = 0;

        for (int i = 0; i < ar.length; i++) {
            if (i == 0) {
                sum = ar[i] + ar[i +1];
                i++;
            } else {
                sum += ar[i];
            }
        }
        return sum;
    }
}
