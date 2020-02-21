package com.Hackerrank.Easy.Generics;

import java.util.Collection;

public class GenericMethods {

    /*
    * This generic method has the ability to print different data type arrays contents.
    * ex. Integer[] i = {1, 2, 3}
    * or
    * ex. String[] s = {"hello", "world", "!"}
    */
    public static <T> void printArray(T[] a) {
        for (T o : a) {
            System.out.println(o);
        }
    }
}
