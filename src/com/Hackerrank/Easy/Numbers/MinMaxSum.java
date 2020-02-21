package com.Hackerrank.Easy.Numbers;

public class MinMaxSum {

    // calculate all values of array, minus min and max values separately
    static void miniMaxSum(int[] arr) {

        long min = arr[0];
        long max = min;
        long sum = min;

        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}
