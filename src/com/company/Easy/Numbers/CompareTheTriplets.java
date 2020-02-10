package com.company.Easy.Numbers;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

    // compare the scores of two people from 3 categories a = {a[0], a[1], a[2]}, b = {b[0], b[1], b[2]}
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int aliceComparisonPoints = 0;
        int bobComparisonPoints = 0;
        List<Integer> combinedComparisonPoints = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            int aliceScore = a.get(i);
            int bobScore = b.get(i);
            if (aliceScore != bobScore) {
                int temp = aliceScore > bobScore ? aliceComparisonPoints++ : bobComparisonPoints++;
            }

        }
        combinedComparisonPoints.add(aliceComparisonPoints);
        combinedComparisonPoints.add(bobComparisonPoints);
        return combinedComparisonPoints;
    }
}
