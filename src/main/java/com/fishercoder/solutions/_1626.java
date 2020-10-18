package com.fishercoder.solutions;

import java.util.Arrays;

public class _1626 {
    public static class Solution1 {
        public int bestTeamScore(int[] scores, int[] ages) {
            int len = scores.length;
            int[][] players = new int[len][2];
            for (int i = 0; i < len; i++) {
                players[i][0] = ages[i];
                players[i][1] = scores[i];
            }
            //sort by age first, if tie, then sort by scores
            Arrays.sort(players, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);

            //dp array is the max possible score up to this age, i.e. dp[2] means the max score up to from age 0 up to age 2
            int[] dp = new int[len];
            dp[0] = players[0][1];
            for (int i = 1; i < len; i++) {
                int maxScoreUpToAgeI = players[i][1];//this is the max score possible on this age i alone
                for (int j = 0; j < i; j++) {
                    //then we try to find all possible scores from the min age up to this age i
                    if (players[i][1] >= players[j][1]) {
                        maxScoreUpToAgeI = Math.max(maxScoreUpToAgeI, dp[j] + players[i][1]);
                    }
                }
                dp[i] = maxScoreUpToAgeI;
            }
            int bestScore = 0;
            for (int score : dp) {
                bestScore = Math.max(bestScore, score);
            }
            return bestScore;
        }
    }
}
