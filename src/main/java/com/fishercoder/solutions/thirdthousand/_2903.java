package com.fishercoder.solutions.thirdthousand;

public class _2903 {
    public static class Solution1 {
        public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
            for (int i = 0; i < nums.length - indexDifference; i++) {
                for (int j = i + indexDifference; j < nums.length; j++) {
                    if (j - i >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[]{-1, -1};
        }
    }
}
