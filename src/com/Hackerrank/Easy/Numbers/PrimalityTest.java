package com.Hackerrank.Easy.Numbers;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {

    public static void primalityTest() {
        final Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        scanner.close();
        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
    }
}
