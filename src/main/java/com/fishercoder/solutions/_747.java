package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 747. Largest Number Greater Than Twice of Others
 *
 * In a given integer array nums, there is always exactly one largest element.
 * Find whether the largest element in the array is at least twice as much as every other number in the array.
 * If it is, return the index of the largest element, otherwise return -1.

 Example 1:
 Input: nums = [3, 6, 1, 0]
 Output: 1
 Explanation: 6 is the largest integer, and for every other number in the array x,
 6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.

 Example 2:
 Input: nums = [1, 2, 3, 4]
 Output: -1
 Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.

 Note:
 nums will have a length in the range [1, 50].
 Every nums[i] will be an integer in the range [0, 99].
 */
public class _747 {

  public static class Solution1 {
    public int dominantIndex(int[] nums) {
      Map<Integer, Integer> map = new HashMap<>();
      int max;
      int secondMax;
      for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
      }
      Arrays.sort(nums);
      max = nums[nums.length - 1];
      secondMax = nums[nums.length - 2];
      if (max >= 2 * secondMax) {
        return map.get(max);
      } else {
        return -1;
      }
    }
  }

  public static class Solution2 {
    public int dominantIndex(int[] nums) {
      int max = Integer.MIN_VALUE;
      int maxIndex = -1;
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] > max) {
          max = nums[i];
          maxIndex = i;
        }
      }
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] * 2 > max && i != maxIndex) {
          return -1;
        }
      }
      return maxIndex;
    }
  }
}
