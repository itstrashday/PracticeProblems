package com.Hackerrank.Easy.Numbers;

import java.util.List;

public class DiagonalDifference {

    /*
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    /*
    *  1 2 3
    *  4 5 6
    *  7 8 9
    *
    * diagonal diff of (1 + 5 + 9) - (3 + 5 + 7) = 15 - 17
    * */
    public static int diagonalDifference(List<List<Integer>> arr) {

        int leftToRight = 0;
        int rightToLeft = 0;

        int rows = arr.size();
        int col = arr.get(0).size();

        int i = 0;
        int j = 0;
        int k = 0;
        int l = arr.size() - 1;

        while (i < rows && j < col && k < rows && l >= 0) {
            leftToRight += arr.get(i).get(j);
            rightToLeft += arr.get(k).get(l);
            i++;
            j++;
            k++;
            l--;
        }
        return Math.abs(leftToRight - rightToLeft);
    }
}
