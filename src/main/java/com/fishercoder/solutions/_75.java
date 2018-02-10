package com.fishercoder.solutions;

/**
 * 75. Sort Colors
 *
 * Given an array with n objects colored red, white or blue,
 * sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

 Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

 Note:
 You are not suppose to use the library's sort function for this problem.

 Follow up:

 A rather straight forward solution is a two-pass algorithm using counting sort.
 First, iterate the array counting number of 0's, 1's, and 2's,
 then overwrite array with total number of 0's, then 1's and followed by 2's.
 Could you come up with an one-pass algorithm using only constant space?
 */

public class _75 {

  public static class Solution1 {
    public void sortColors(int[] nums) {
      int zero = 0;
      int two = nums.length - 1;
      for (int i = 0; i <= two; ) {
        if (nums[i] == 0 && i > zero) {
          swap(nums, i, zero++);
        } else if (nums[i] == 2 && i < two) {
          swap(nums, i, two--);
        } else {
          i++;
        }
      }
    }

    void swap(int[] nums, int m, int n) {
      int temp = nums[m];
      nums[m] = nums[n];
      nums[n] = temp;
    }
  }
}
