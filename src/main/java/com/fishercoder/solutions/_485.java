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
}
