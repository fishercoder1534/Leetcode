package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 189. Rotate Array

 Given an array, rotate the array to the right by k steps, where k is non-negative.

 Example 1:
 Input: [1,2,3,4,5,6,7] and k = 3
 Output: [5,6,7,1,2,3,4]
 Explanation:
 rotate 1 steps to the right: [7,1,2,3,4,5,6]
 rotate 2 steps to the right: [6,7,1,2,3,4,5]
 rotate 3 steps to the right: [5,6,7,1,2,3,4]

 Example 2:
 Input: [-1,-100,3,99] and k = 2
 Output: [3,99,-1,-100]
 Explanation:
 rotate 1 steps to the right: [99,-1,-100,3]
 rotate 2 steps to the right: [3,99,-1,-100]

 Note:
 Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 Could you do it in-place with O(1) extra space?

 * */

public class _189 {

  public static class Solution1 {
    /**
     * O(n) space
     * O(n) time
     * */
    public void rotate(int[] nums, int k) {
      int len = nums.length;
      int[] tmp = new int[len];
      for (int i = 0; i < len; i++) {
        tmp[(i + k) % len] = nums[i];
      }
      for (int i = 0; i < len; i++) {
        nums[i] = tmp[i];
      }
    }
  }

  public static class Solution2 {
    /**
     * O(1) space
     * O(n) time
     * */
    public void rotate(int[] nums, int k) {
      int tmp;
      for (int i = 0; i < k; i++) {
        tmp = nums[nums.length - 1];
        for (int j = nums.length - 1; j > 0; j--) {
          nums[j] = nums[j - 1];
        }
        nums[0] = tmp;
      }
    }
  }

  public static class Solution3 {
    /**
     * My original idea and got AC'ed.
     * One thing to notice is that when k > nums.length, we'll continue to rotate the array, it just becomes k -= nums.length
     */
    public static void rotate(int[] nums, int k) {
      if (k == 0 || k == nums.length) {
        return;
      }
      if (k > nums.length) {
        k -= nums.length;
      }
      List<Integer> tmp = new ArrayList();
      int i = 0;
      if (nums.length - k >= 0) {
        i = nums.length - k;
        for (; i < nums.length; i++) {
          tmp.add(nums[i]);
        }
      } else {
        i = nums.length - 1;
        for (; i >= 0; i--) {
          tmp.add(nums[i]);
        }
      }
      for (i = 0; i < nums.length - k; i++) {
        tmp.add(nums[i]);
      }
      for (i = 0; i < tmp.size(); i++) {
        nums[i] = tmp.get(i);
      }
    }
  }
}
