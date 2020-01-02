package com.fishercoder.solutions;

/**
 * 1150. Check If a Number Is Majority Element in a Sorted Array
 *
 * Given an array nums sorted in non-decreasing order, and a number target, return True if and only if target is a majority element.
 * A majority element is an element that appears more than N/2 times in an array of length N.
 *
 * Example 1:
 * Input: nums = [2,4,5,5,5,5,5,6,6], target = 5
 * Output: true
 * Explanation:
 * The value 5 appears 5 times and the length of the array is 9.
 * Thus, 5 is a majority element because 5 > 9/2 is true.
 *
 * Example 2:
 * Input: nums = [10,100,101,101], target = 101
 * Output: false
 * Explanation:
 * The value 101 appears 2 times and the length of the array is 4.
 * Thus, 101 is not a majority element because 2 > 4/2 is false.
 *
 * Note:
 * 1 <= nums.length <= 1000
 * 1 <= nums[i] <= 10^9
 * 1 <= target <= 10^9
 **/
public class _1150 {
    public static class Solution1 {
        /**credit: https://leetcode.com/problems/check-if-a-number-is-majority-element-in-a-sorted-array/discuss/358130/Java-just-one-binary-search-O(logN))-0ms-beats-100*/
        public boolean isMajorityElement(int[] nums, int target) {
            int firstIndex = findFirstOccur(nums, target);
            int plusHalfIndex = firstIndex + nums.length / 2;
            return plusHalfIndex < nums.length && nums[plusHalfIndex] == target;
        }

        private int findFirstOccur(int[] nums, int target) {
            int left = 0;
            int right = nums.length;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] < target) {
                    left = mid + 1;
                } else if (nums[mid] >= target) {
                    right = mid;
                }
            }
            return left;
        }
    }
}
