package com.fishercoder.solutions.thirdthousand;

public class _2644 {
    public static class Solution1 {
        public int maxDivScore(int[] nums, int[] divisors) {
            int[][] scores = new int[divisors.length][2];
            for (int i = 0; i < divisors.length; i++) {
                int score = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] % divisors[i] == 0) {
                        score++;
                    }
                }
                scores[i][0] = score;
                scores[i][1] = divisors[i];
            }
            int maxScore = -1;
            for (int i = 0; i < divisors.length; i++) {
                maxScore = Math.max(maxScore, scores[i][0]);
            }
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < divisors.length; i++) {
                if (maxScore == scores[i][0]) {
                    if (ans > scores[i][1]) {
                        ans = scores[i][1];
                    }
                } else if (maxScore < scores[i][0]) {
                    maxScore = scores[i][0];
                    ans = scores[i][1];
                }
            }
            return ans;
        }
    }
}
