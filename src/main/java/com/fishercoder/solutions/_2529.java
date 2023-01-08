package com.fishercoder.solutions;

public class _2529 {
    public static class Solution1 {
        public int maximumCount(int[] nums) {
            int pos = 0;
            int neg = 0;
            for (int num : nums) {
                if (num > 0) {
                    pos++;
                } else if (num < 0) {
                    neg++;
                }
            }
            return Math.max(pos, neg);
        }
    }
}
