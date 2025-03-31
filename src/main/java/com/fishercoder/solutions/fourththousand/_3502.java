package com.fishercoder.solutions.fourththousand;

public class _3502 {
    public static class Solution1 {
        public int[] minCosts(int[] cost) {
            int[] res = new int[cost.length];
            int min = cost[0];
            for (int i = 0; i < cost.length; i++) {
                if (cost[i] < min) {
                    min = cost[i];
                }
                res[i] = min;
            }
            return res;
        }
    }
}
