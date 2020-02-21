package com.Hackerrank.Easy.Strings;

public class MarsExploration {

    // calculate the total # of chars that are not SOS * n times.. ex SOSOSOSOSOST = 1 & SMSTT = 3
    static int marsExploration(String s) {

        int counter = 0;
        StringBuilder sosMessage = new StringBuilder();

        // create the original sos message
        for (int i = 1; i <= (s.length() / 3); i++) {
            sosMessage.append("SOS");
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sosMessage.charAt(i)) {
                counter++;
            }
        }

        return counter;
    }
}
