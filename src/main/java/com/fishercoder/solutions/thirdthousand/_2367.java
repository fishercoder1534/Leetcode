package com.fishercoder.solutions.thirdthousand;

public class _2367 {
    public static class Solution1 {
        public int arithmeticTriplets(int[] nums, int diff) {
            int count = 0;
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[j] - nums[i] == nums[k] - nums[j] && nums[k] - nums[j] == diff) {
                            count++;
                        }
                    }
                }
            }
            return count;
        }
    }
}
