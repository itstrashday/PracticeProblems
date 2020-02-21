package com.Hackerrank.Easy.Numbers;

public class SockMerchant {

    public static int sockMerchant(int n, int[] ar) {

        int matchingPairs = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j] && ar[i] != 0) {
                    ar[i] = 0;
                    ar[j] = 0;
                    matchingPairs++;
                    break;
                }
            }
        }
        return matchingPairs;
    }
}
