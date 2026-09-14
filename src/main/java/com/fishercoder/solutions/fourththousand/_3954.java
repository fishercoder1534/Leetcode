package com.fishercoder.solutions.fourththousand;

public class _3954 {
    public static class Solution1 {
        public int sumOfGoodIntegers(int n, int k) {
            int sum = 0;
            for (int x = Math.max(n - k, 1); x <= n + k; x++) {
                if (Math.abs(n - x) <= k && (n & x) == 0) {
                    sum += x;
                }
            }
            return sum;
        }
    }
}
