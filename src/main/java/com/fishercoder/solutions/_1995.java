package com.fishercoder.solutions;

public class _1995 {
    public static class Solution1 {
        public int countQuadruplets(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length - 3; i++) {
                for (int j = i + 1; j < nums.length - 2; j++) {
                    for (int k = j + 1; k < nums.length - 1; k++) {
                        for (int l = k + 1; l < nums.length; l++) {
                            if (nums[i] + nums[j] + nums[k] == nums[l]) {
                                count++;
                            }
                        }
                    }
                }
            }
            return count;
        }
    }
}
