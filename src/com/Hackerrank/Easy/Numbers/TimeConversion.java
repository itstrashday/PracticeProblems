package com.Hackerrank.Easy.Numbers;

public class TimeConversion {

    // convert a 12 hour time to 24.. ex: 07:45:23PM -> 19:45:23
    static String timeConversion(String s) {

        String[] str = s.split(":");
        int hour = Integer.parseInt(str[0]);

        String min = str[1];
        // seconds w/ am or pm
        String secFull = str[2];
        // seconds only
        String sec = str[2].substring(0, secFull.length() - 2);
        // am or pm only
        String am_PM = str[2].substring(secFull.length() - 2, secFull.length());

        // 24 hour time
        String newTime = "";

        // AM time
        if ((0 <= hour && hour < 12) && (am_PM.equalsIgnoreCase("AM"))) {
            newTime = String.format("%02d", hour) + ":" + min + ":" + sec;
        } else if ((hour == 12) && (am_PM.equalsIgnoreCase("AM"))) {
            newTime = "00" + ":" + min + ":" + sec;

        // PM time
        } else if ((0 <= hour && hour < 12) && (am_PM.equalsIgnoreCase("PM"))) {
            newTime = (12 + hour) + ":" + min + ":" + sec;
        } else if ((hour == 12) && (am_PM.equalsIgnoreCase("PM"))) {
            newTime = hour + ":" + min + ":" + sec;
        }
        return newTime;
    }
}
