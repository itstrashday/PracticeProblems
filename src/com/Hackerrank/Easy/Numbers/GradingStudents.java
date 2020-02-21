package com.Hackerrank.Easy.Numbers;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> roundedGrades = new ArrayList<>();

        for (int i = 0; i < grades.size(); i++) {
            int round1 = (grades.get(i) +1) % 5;
            int round2 = (grades.get(i) + 2) % 5;
            if (grades.get(i) < 38) {
                roundedGrades.add(grades.get(i));
            } else if (round1 == 0) {
                int rounded = grades.get(i) + 1;
                roundedGrades.add(rounded);
            } else if (round2 == 0) {
                int rounded = grades.get(i) + 2;
                roundedGrades.add(rounded);
            } else {
                roundedGrades.add(grades.get(i));
            }
        }
        return roundedGrades;
    }
}
