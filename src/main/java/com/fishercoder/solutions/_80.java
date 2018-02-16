package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 80. Remove Duplicates from Sorted Array II
 *
 * Follow up for "Remove Duplicates":
 What if duplicates are allowed at most twice?

 For example,
 Given sorted array nums = [1,1,1,2,2,3],

 Your function should return length = 5,
 with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
 */
public class _80 {

  public static class Solution1 {
    public int removeDuplicates(int[] nums) {
      int counter = 0;
      int len = nums.length;
      if (len == 0) {
        return 0;
      }
      if (len == 1) {
        return 1;
      }
      if (len == 2) {
        return 2;
      }

      List<Integer> a = new ArrayList();
      a.add(nums[0]);
      a.add(nums[1]);
      for (int i = 2; i < len; i++) {
        if (nums[i] != nums[i - 1]) {
          a.add(nums[i]);
        } else if (nums[i] != nums[i - 2]) {
          a.add(nums[i]);
        }
      }

      counter = a.size();
      for (int i = 0; i < counter; i++) {
        nums[i] = a.get(i);
      }
      return counter;
    }
  }

}
