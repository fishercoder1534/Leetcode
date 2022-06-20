package com.fishercoder.solutions;

public class _2293 {
    public static class Solution1 {
        public int minMaxGame(int[] nums) {
            if (nums.length == 1) {
                return nums[0];
            }
            int[] newNums = new int[nums.length / 2];
            boolean min = true;
            for (int i = 0, j = 0; i < nums.length; i += 2, j++) {
                if (min) {
                    min = false;
                    newNums[j] = Math.min(nums[i], nums[i + 1]);
                } else {
                    min = true;
                    newNums[j] = Math.max(nums[i], nums[i + 1]);
                }
            }
            return minMaxGame(newNums);
        }
    }
}
