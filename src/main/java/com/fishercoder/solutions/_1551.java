package com.fishercoder.solutions;

public class _1551 {
    public static class Solution1 {
        public int minOperations(int n) {
            int min = 1;
            int max = 2 * (n - 1) + 1;
            int equalNumber = (max + min) / 2;
            int ops = 0;
            for (int i = 0; i < n / 2; i++) {
                ops += equalNumber - (2 * i + 1);
            }
            return ops;
        }
    }
}
