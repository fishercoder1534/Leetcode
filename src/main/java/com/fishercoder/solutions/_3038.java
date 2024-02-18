package com.fishercoder.solutions;

public class _3038 {
    public static class Solution1 {
        public int maxOperations(int[] nums) {
            int maxOps = 0;
            if (nums == null || nums.length < 2) {
                return maxOps;
            }
            maxOps++;
            int sum = nums[0] + nums[1];
            for (int i = 2; i < nums.length - 1; i += 2) {
                if (nums[i] + nums[i + 1] == sum) {
                    maxOps++;
                } else {
                    break;
                }
            }
            return maxOps;
        }
    }
}
