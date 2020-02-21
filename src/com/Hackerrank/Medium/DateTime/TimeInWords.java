package com.Hackerrank.Medium.DateTime;

import java.util.HashMap;

public class TimeInWords {

    static String timeInWords(int h, int m) {

        String timeInWords;
        HashMap<Integer, String> words = new HashMap<>();
        words.put(1, "one"); words.put(2, "two"); words.put(3, "three"); words.put(4, "four"); words.put(5, "five");
        words.put(6, "six"); words.put(7, "seven"); words.put(8, "eight"); words.put(9, "nine"); words.put(10, "ten");
        words.put(11, "eleven"); words.put(12, "twelve"); words.put(13, "thirteen"); words.put(14, "fourteen"); words.put(15, "fifteen");
        words.put(16, "sixteen"); words.put(17, "seventeen"); words.put(18, "eighteen"); words.put(19, "nineteen");

        if (m == 0) {
           timeInWords = words.get(h) + " o' clock";
           return timeInWords;
        }

        if (m < 30) {
            if (m > 1) {
                if (m > 20) {
                    timeInWords = "twenty " +words.get(m - 20) + " minutes past " + words.get(h);
                } else if (m == 15) {
                    timeInWords = "quarter past " + words.get(h);
                } else {
                    timeInWords = words.get(m) + " minutes past " + words.get(h);
                }
            } else {
                timeInWords = words.get(m) + " minute past " + words.get(h);
            }
        } else if (m > 30) {
            if (m == 45) {
               timeInWords = "quarter to " + words.get(h + 1);
            } else if (60 - m > 20) {
                timeInWords = "twenty " + words.get(60 - m - 20) + " minutes to " + words.get(h + 1);
            } else if (60 - m < 20) {
                timeInWords = words.get(60 - m) + " minutes to " + words.get(h + 1);
            } else {
                timeInWords = "twenty minutes to " + words.get(h + 1);
            }
        } else {
            timeInWords = "half past " + words.get(h);
        }
        return timeInWords;
    }
}
