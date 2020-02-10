package com.company.Easy.Strings;

public class RepeatingString {

    // count the occurrences of a char in a given substring that is repeated for n number of times
    static long repeatedString(String s, long n) {

        //ex. substring 'aba'
        //ex. long = 10

        long whole = n / s.length(); // the # of substrings that fit within n (10 / 3 = 3)
        int remainder = (int) (n % s.length()); // # of positions left over after dividing total by substring (10 / 3 = 1 left over)
        long found = 0; // occurrences of char

        for (char ch : s.toCharArray()) { // enhanced loop through the substring 'aba'
            if (ch == 'a') { // we found 'a' 2 times
                found++;
            }
        }
        long total = found * whole; // 2 * 3 = 6
        if (remainder == 0) { // remainder = 1 in our ex
            return total;
        } else {
            String part = s.substring(0, remainder); // create new substring of the leftovers (ex. = 'a') because of our 1 remainder
            for (char ch : part.toCharArray()) {
                if (ch == 'a') { // so we found 1 more 'a' in the new substring of 'a'
                    total++; // add it to the total (6 + 1 = 7)
                }
            }
        }
        return total; // 7
    }
}
