package com.fishercoder.solutions.thirdthousand;

public class _2475 {
    public static class Solution1 {
        public int unequalTriplets(int[] nums) {
            int triplets = 0;
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    if (nums[i] != nums[j]) {
                        for (int k = j + 1; k < nums.length; k++) {
                            if (nums[i] != nums[k] && nums[j] != nums[k]) {
                                triplets++;
                            }
                        }
                    }
                }
            }
            return triplets;
        }
    }
}
