package com.fishercoder.solutions;

public class _518 {
    public static class Solution1 {
        public int change(int amount, int[] coins) {
            int[] ways = new int[amount + 1];
            ways[0] = 1;
            for (int denom : coins) {
                for (int i = 0; i < ways.length; i++) {
                    if (denom <= i) {
                        ways[i] += ways[i - denom];
                    }
                }
            }
            return ways[amount];
        }
    }
}
