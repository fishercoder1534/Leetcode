package com.fishercoder.solutions;

public class _485 {
    public static class Solution1 {
        public int findMaxConsecutiveOnes(int[] nums) {
            int maxLen = 0;
            for (int i = 0; i < nums.length; i++) {
                int currentLen = 0;
                while (i < nums.length && nums[i] == 1) {
                    i++;
                    currentLen++;
                }
                maxLen = Math.max(maxLen, currentLen);
            }
            return maxLen;
        }
    }

    public static class Solution2 {
        /**
         * Apply the sliding window template, i.e. two pointer technique.
         */
        public int findMaxConsecutiveOnes(int[] nums) {
            int left = 0;
            int right = 0;
            int ans = 0;
            while (right < nums.length) {
                while (right < nums.length && nums[right] == 1) {
                    right++;
                }
                ans = Math.max(ans, right - left);
                while (right < nums.length && nums[right] != 1) {
                    right++;
                }
                left = right;
            }
            return ans;
        }
    }
}
