package com.fishercoder.solutions.thirdthousand;

public class _2733 {
    public static class Solution1 {
        public int findNonMinOrMax(int[] nums) {
            int max = 0;
            int min = Integer.MAX_VALUE;
            for (int num : nums) {
                max = Math.max(max, num);
                min = Math.min(min, num);
            }
            for (int num : nums) {
                if (num != max && num != min) {
                    return num;
                }
            }
            return -1;
        }
    }
}
