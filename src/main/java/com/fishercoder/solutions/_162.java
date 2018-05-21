package com.fishercoder.solutions;

/**
 * 162. Find Peak Element

 A peak element is an element that is greater than its neighbors.

 Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.

 The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

 You may imagine that nums[-1] = nums[n] = -∞.

 Example 1:
 Input: nums = [1,2,3,1]
 Output: 2
 Explanation: 3 is a peak element and your function should return the index number 2.

 Example 2:
 Input: nums = [1,2,1,3,5,6,4]
 Output: 1 or 5
 Explanation: Your function can return either index number 1 where the peak element is 2,
 or index number 5 where the peak element is 6.

 Note:
 Your solution should be in logarithmic complexity.
 */

public class _162 {

  public static class Solution1 {
    /**
     * credit: https://discuss.leetcode.com/topic/29329/java-solution-and-explanation-using-invariants
     *
     * Basically, we need to keep this invariant:
     * nums[left] > nums[left-1], then we could return left as the result
     * or nums[right] > nums[right+1], then we could return right as the result
     *
     * Time: O(Ologn)
     */
    public int findPeakElement(int[] nums) {
      if (nums == null || nums.length == 0) {
        return 0;
      }
      int left = 0;
      int right = nums.length - 1;
      while (left + 1 < right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] < nums[mid + 1]) {
          left = mid;
        } else {
          right = mid;
        }
      }
      return (left == nums.length - 1 || nums[left] > nums[left + 1]) ? left : right;
    }
  }

  public static class Solution2 {
    /**
     * My original O(n) solution.
     */
    public int findPeakElement(int[] nums) {
      if (nums == null || nums.length == 0) {
        return 0;
      }
      int n = nums.length;
      int result = 0;
      for (int i = 0; i < n; i++) {
        if (i == 0 && n > 1 && nums[i] > nums[i + 1]) {
          result = i;
          break;
        } else if (i == n - 1 && i > 0 && nums[i] > nums[i - 1]) {
          result = i;
          break;
        } else if (i > 0 && i < n - 1 && nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
          result = i;
          break;
        }
      }
      return result;
    }
  }
}
