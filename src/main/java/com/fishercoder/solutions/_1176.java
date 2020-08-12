package com.fishercoder.solutions;

public class _1176 {
    public static class Solution1 {
        public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
            int sum = 0;
            int points = 0;
            for (int i = 0, j = 0; i <= calories.length - k && j < calories.length; j++) {
                sum += calories[j];
                if (j - i > k - 1) {
                    sum -= calories[i++];
                }
                if (j - i == k - 1) {
                    if (sum > upper) {
                        points++;
                    } else if (sum < lower) {
                        points--;
                    }
                }
            }
            return points;
        }
    }
}
