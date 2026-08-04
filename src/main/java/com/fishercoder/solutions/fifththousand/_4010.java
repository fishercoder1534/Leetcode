package com.fishercoder.solutions.fifththousand;

public class _4010 {
    public static class Solution1 {
        public long maxPairStrength(int[] nums) {
            long max = Long.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i != j) {
                        max = Math.max(max, computeStrength(nums[i], nums[j]));
                    }
                }
            }
            return max;
        }

        private long computeStrength(long x, long y) {
            long gcd = getGcd(x, y);
            return (x * y) / (gcd * gcd);
        }

        private long getGcd(long x, long y) {
            while (y != 0) {
                long tmp = y;
                y = x % y;
                x = tmp;
            }
            return x;
        }
    }
}
