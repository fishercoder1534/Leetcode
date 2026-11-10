package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;

public class _3693 {
    public static class Solution1 {
        /**
         * Credit: Gemini
         */
        public int climbStairs(int n, int[] costs) {
            int[] minCosts = new int[n + 1];
            Arrays.fill(minCosts, Integer.MAX_VALUE);

            // Base case: Start at step 0 with 0 cost
            minCosts[0] = 0;

            // DP Transition
            for (int i = 1; i <= n; i++) {
                int currentStepCost = costs[i - 1];

                // Look backward at the past 1, 2, or 3 possible steps
                for (int j = Math.max(0, i - 3); j < i; j++) {
                    int jumpDistance = i - j;
                    int jumpCost = currentStepCost + (jumpDistance * jumpDistance);

                    minCosts[i] = Math.min(minCosts[i], minCosts[j] + jumpCost);
                }
            }

            return minCosts[n];
        }
    }
}
