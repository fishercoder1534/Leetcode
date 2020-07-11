package com.fishercoder.solutions;

/**
 * 1248. Count Number of Nice Subarrays
 *
 * Given an array of integers nums and an integer k. A subarray is called nice if there are k odd numbers on it.
 *
 * Return the number of nice sub-arrays.
 *
 * Example 1:
 * Input: nums = [1,1,2,1,1], k = 3
 * Output: 2
 * Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
 *
 * Example 2:
 * Input: nums = [2,4,6], k = 1
 * Output: 0
 * Explanation: There is no odd numbers in the array.
 *
 * Example 3:
 * Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
 * Output: 16
 *
 * Constraints:
 * 1 <= nums.length <= 50000
 * 1 <= nums[i] <= 10^5
 * 1 <= k <= nums.length
 * */
public class _1248 {
    public static class Solution1 {
        public int numberOfSubarrays(int[] nums, int k) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {

                }
            }
            return -1;
        }
    }
}
