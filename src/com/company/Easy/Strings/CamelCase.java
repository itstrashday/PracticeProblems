package com.company.Easy.Strings;

public class CamelCase {

    static int camelcase(String s) {

        int numOfWords = 0;

        if (s != null) {

            numOfWords = 1;

            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    numOfWords++;
                }
            }
        }
        return numOfWords;
    }
}
