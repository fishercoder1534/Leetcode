package com.fishercoder.solutions;

public class _1708 {
    public static class Solution1 {
        public int[] largestSubarray(int[] nums, int k) {
            int max = nums[0];
            int beginIndex = 0;
            for (int i = 1; i <= nums.length - k; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    beginIndex = i;
                }
            }
            int[] result = new int[k];
            for (int i = beginIndex, j = 0; i < i + k && j < k; i++) {
                result[j++] = nums[i];
            }
            return result;
        }
    }
}
