package com.fishercoder.solutions;

public class _1512 {
    public static class Solution1 {
        public int numIdenticalPairs(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
