package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 164. Maximum Gap
 *
 * Given an unsorted array, find the maximum difference between the successive elements in its sorted form.
 * Return 0 if the array contains less than 2 elements.
 *
 * Example 1:
 * Input: [3,6,9,1]
 * Output: 3
 * Explanation: The sorted form of the array is [1,3,6,9], either
 *              (3,6) or (6,9) has the maximum difference 3.
 *
 * Example 2:
 * Input: [10]
 * Output: 0
 * Explanation: The array contains less than 2 elements, therefore return 0.
 *
 * Note:
 *  You may assume all elements in the array are non-negative integers and fit in the 32-bit signed integer range.
 *  Try to solve it in linear time/space.
 */
public class _164 {
  public static class Solution1 {
    /** brute force solution */
    public int maximumGap(int[] nums) {
      if (nums.length < 2) {
        return 0;
      }

      Arrays.sort(nums);
      int max = Integer.MIN_VALUE;
      for (int i = 1; i < nums.length; ) {
        while (i < nums.length && nums[i] == nums[i - 1]) {
          i++;
        }
        if (i == nums.length) {
          i--;
          max = (nums[i] - nums[i - 1] > max) ? nums[i] - nums[i - 1] : max;
          break;
        } else {
          max = (nums[i] - nums[i - 1] > max) ? nums[i] - nums[i - 1] : max;
        }
        if (nums[i] != nums[i - 1]) {
          i++;
        }
      }
      return max;
    }
  }
}
