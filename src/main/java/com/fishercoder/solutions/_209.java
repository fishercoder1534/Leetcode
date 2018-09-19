package com.fishercoder.solutions;

/**
 * 209. Minimum Size Subarray Sum
 *
 * Given an array of n positive integers and a positive integer s,
 * find the minimal length of a contiguous subarray of which the sum ≥ s.
 * If there isn't one, return 0 instead.

 For example, given the array [2,3,1,2,4,3] and s = 7,
 the subarray [4,3] has the minimal length under the problem constraint.

 click to show more practice.

 More practice:
 If you have figured out the O(n) solution,
 try coding another solution of which the time complexity is O(n log n).
 */
public class _209 {

    public static class Solution1 {
        public int minSubArrayLen(int s, int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int i = 0;
            int j = 0;
            int min = Integer.MAX_VALUE;
            int sum = 0;
            while (j < nums.length) {
                sum += nums[j++];

                while (sum >= s) {
                    min = Math.min(min, j - i);
                    sum -= nums[i++];
                }
            }
            return min == Integer.MAX_VALUE ? 0 : min;
        }
    }
}
