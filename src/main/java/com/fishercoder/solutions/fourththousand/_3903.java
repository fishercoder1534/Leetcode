package com.fishercoder.solutions.fourththousand;

public class _3903 {
    public static class Solution1 {
        public int firstStableIndex(int[] nums, int k) {
            int max = nums[0];
            int min = nums[nums.length - 1];
            int[] instablityScores = new int[nums.length];
            for (int i = 0; i < instablityScores.length; i++) {
                max = Math.max(max, nums[i]);
                for (int j = i; j < nums.length; j++) {
                    min = Math.min(min, nums[j]);
                }
                instablityScores[i] = max - min;
                min = nums[nums.length - 1];
            }
            for (int i = 0; i < instablityScores.length; i++) {
                if (instablityScores[i] <= k) {
                    return i;
                }
            }
            return -1;
        }
    }
}
