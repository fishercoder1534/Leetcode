package com.fishercoder.solutions.thirdthousand;

public class _2656 {
    public static class Solution1 {
        public int maximizeSum(int[] nums, int k) {
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i]);
            }
            int sum = 0;
            while (k-- > 0) {
                sum += max;
                max++;
            }
            return sum;
        }
    }
}
