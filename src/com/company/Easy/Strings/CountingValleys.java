package com.company.Easy.Strings;

public class CountingValleys {

    // count the valleys that the hiker enters from sea level and returns to sea level
    static int countingValleys(int n, String s) {

        int counter = 0;
        int valleys = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'U') {
                counter++;
                if (counter == 0) {
                    valleys++;
                }
            } else if (ch == 'D'){
                counter--;
            }
        }

        return valleys;
    }
}
