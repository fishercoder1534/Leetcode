package com.fishercoder.solutions;

public class _1749 {
    public static class Solution1 {
        public int maxAbsoluteSum(int[] nums) {
            int min = 0;
            int max = 0;
            int s = 0;
            for (int num : nums) {
                s += num;
                min = Math.min(min, s);
                max = Math.max(max, s);
            }
            return max - min;
        }
    }
}
