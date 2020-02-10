package com.company.Medium;

import java.math.BigInteger;

public class ExtraLongFactorials {

    static void extraLongFactorials(int n) {

        BigInteger factorial = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(factorial);
    }
}
