package com.fishercoder.solutions;

/**
 * 31. Next Permutation

Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place, do not allocate extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1
 */

public class _31 {
  public static class Solution1 {
    /**
     * Leetcode has a very good article to illustrate this problem and with animation:
     * https://leetcode.com/articles/next-permutation/
     * 1. if the array is already in decrementing order, then there's no next larger permutation possible.
     * 2. if not, start from the end of the array, find the first pair of numbers that break the decrementing order
     * 3. then from that index going to the right again, find the element that is closest bigger than this number, swap them
     * 4. reverse the right half of this array after this index
     */

    public void nextPermutation(int[] nums) {
      int i = nums.length - 2;
      while (i >= 0 && nums[i] >= nums[i + 1]) {
        i--;
      }
      if (i >= 0) {
        int j = nums.length - 1;
        while (j >= 0 && nums[i] >= nums[j]) {
          j--;
        }

        swap(nums, i, j);
      }

      reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int start) {
      int end = nums.length - 1;
      while (start <= end) {
        int tmp = nums[start];
        nums[start++] = nums[end];
        nums[end--] = tmp;
      }
    }

    private void swap(int[] nums, int i, int j) {
      int tmp = nums[i];
      nums[i] = nums[j];
      nums[j] = tmp;
    }
  }
}
