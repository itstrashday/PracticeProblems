package com.Hackerrank.Easy.Numbers;

public class SimpleArraySum {


    // Sum all the values in the array
    static int simpleArraySum(int[] ar) {
        int sum = 0;

        for (int i = 0; i < ar.length; i++) {
            if (i == 0) { // sum the 1st 2 values
                sum = ar[i] + ar[i + 1];
                i++;
            } else { // after the 1st 2 values are summed, take that number and sum the next index
                sum += ar[i];
            }
        }

        return sum;
    }
}
