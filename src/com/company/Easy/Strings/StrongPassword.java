package com.company.Easy.Strings;

public class StrongPassword {

    // Return the minimum number of characters to make the password strong
    /*  Its length is at least 6.
        It contains at least one digit.
        It contains at least one lowercase English character.
        It contains at least one uppercase English character.
        It contains at least one special character. The special characters are: !@#$%^&*()-+
        */
    static int minimumNumber(int n, String password) {

        String SPECIAL_CHARACTERS = "!@#$%^&*()-+";

        int addNum = 0;
        if (!password.chars().anyMatch(Character::isDigit)) {
            addNum++;
        }
        if (!password.chars().anyMatch(Character::isLowerCase)) {
            addNum++;
        }
        if (!password.chars().anyMatch(Character::isUpperCase)) {
            addNum++;
        }
        if (!password.chars().anyMatch(ch -> SPECIAL_CHARACTERS.indexOf((char) ch) >= 0)) {
            addNum++;
        }
        addNum = Math.max(addNum, 6 - password.length());

        return addNum;
    }
}
