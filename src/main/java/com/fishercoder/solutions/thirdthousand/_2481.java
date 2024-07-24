package com.fishercoder.solutions.thirdthousand;

public class _2481 {
    public static class Solution1 {
        public int numberOfCuts(int n) {
            if (n == 1) {
                return 0;
            }
            if (n % 2 == 0) {
                return n / 2;
            }
            return n;
        }
    }
}
