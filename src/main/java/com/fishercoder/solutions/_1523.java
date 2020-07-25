package com.fishercoder.solutions;

public class _1523 {
    public static class Solution1 {
        public int countOdds(int low, int high) {
            if (low % 2 != 0 || high % 2 != 0) {
                return (high - low) / 2 + 1;
            }
            return (high - low) / 2;
        }
    }
}
