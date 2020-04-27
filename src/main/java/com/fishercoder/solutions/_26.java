package com.fishercoder.solutions;

public class _26 {

  public static class Solution1 {
    /**Key: It doesn't matter what you leave beyond the returned length.*/
    public int removeDuplicates(int[] nums) {
      int i = 0;
      for (int j = 1; j < nums.length; j++) {
        if (nums[i] != nums[j]) {
          i++;
          nums[i] = nums[j];
        }
      }
      return i + 1;
    }
  }
}
