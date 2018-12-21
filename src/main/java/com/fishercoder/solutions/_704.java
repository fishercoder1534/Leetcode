package com.fishercoder.solutions;

/**
 * 704. Binary Search
 *
 * Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums.
 * If target exists, then return its index, otherwise return -1.
 *
 * Example 1:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 *
 * Example 2:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 *
 * Note:
 *
 * You may assume that all elements in nums are unique.
 * n will be in the range [1, 10000].
 * The value of each element in nums will be in the range [-9999, 9999].
 */
public class _704 {
  public static class Solution1 {
    public int search(int[] nums, int target) {
      int left = 0;
      int right = nums.length - 1;
      if (target < nums[left] || target > nums[right]) {
        return -1;
      }
      if (nums[left] == target) {
        return left;
      } else if (nums[right] == target) {
        return right;
      }
      while (left <= right) {
        int mid = left + (right - left) / 2;
        if (target == nums[mid]) {
          return mid;
        } else if (target > nums[mid]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
      return -1;
    }
  }
}
