package com.fishercoder.solutions;

/**
 * 485. Max Consecutive Ones
 *
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * Example 1:
 *
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 *
 * Note:
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 * */
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
