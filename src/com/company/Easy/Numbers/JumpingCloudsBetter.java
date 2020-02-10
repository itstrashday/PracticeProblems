package com.company.Easy.Numbers;

public class JumpingCloudsBetter {

    // count the number of steps it takes to get to the end of the array, skipping 1's and if 3 0's in a row, skip the middle one
    public static int jumpingOnClouds(int[] c) {

        int numberOfJumps = 0;
        int i = 0;

        while (i < c.length -1) {
            if (i + 2 == c.length || c[i + 2] == 1) { // only increment 1 if at the 2nd to last position or there is a 1 at i + 2
                i++;
            } else {
                i += 2; // skip over the next number cause its a 0
            }
            numberOfJumps++;
        }
        return numberOfJumps;
    }
}
