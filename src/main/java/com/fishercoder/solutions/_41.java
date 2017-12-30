package com.fishercoder.solutions;

/**
 *41. First Missing Positive
 *
 *Given an unsorted integer array, find the first missing positive integer.

 For example,
 Given [1,2,0] return 3,
 and [3,4,-1,1] return 2.

 Your algorithm should run in O(n) time and uses constant space.
 */

public class _41 {

  public static class Solution1 {
    /**
     * Time: O(n) Space: O(1)
     *
     * Idea: put every number in its right position, e.g. put 5 in nums[4].
     */
    public int firstMissingPositive(int[] nums) {
      int i = 0;
      while (i < nums.length) {
        if (nums[i] > 0 && nums[i] != i + 1 && nums[i] - 1 < nums.length && nums[i] != nums[nums[i]
            - 1]) {
          swap(nums, i, nums[i] - 1);
        } else {
          i++;
        }
      }

      for (int j = 0; j < nums.length; j++) {
        if (nums[j] != j + 1) {
          return j + 1;
        }
      }

      return nums.length + 1;
    }

    void swap(int[] nums, int i, int j) {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }
  }
}
