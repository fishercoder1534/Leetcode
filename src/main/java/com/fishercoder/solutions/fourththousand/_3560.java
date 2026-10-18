package com.fishercoder.solutions.fourththousand;

public class _3560 {
    public static class Solution1 {
        public long minCuttingCost(int n, int m, int k) {
            if (n <= k) {
                return minCost(m, k);
            }
            return minCost(n, k);
        }

        private long minCost(int n, int k) {
            if (n <= k) {
                return 0;
            }
            return (long) (n - k) * k;
        }
    }
}
