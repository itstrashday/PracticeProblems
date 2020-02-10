package com.company.Easy.Numbers;

public class BreakingTheRecords {

    // keeps track of lowest and highest scores for games
    static int[] breakingRecords(int[] scores) {

        int highScore = scores[0];
        int lowScore = scores[0];

        int breaksMin = 0;
        int breaksMax = 0;

        for (int i = 1; i < scores.length; i++){
            if (scores[i] > highScore) {
                highScore = scores[i];
                breaksMax++;
            } else if (scores[i] < lowScore) {
                lowScore = scores[i];
                breaksMin++;
            }
        }
        int[] records = {breaksMax, breaksMin};
        return records;
    }
}
