package com.fishercoder.solutions;

public class _27 {

  public static class Solution1 {
    public int removeElement(int[] nums, int val) {
      int i = 0;
      for (int j = 0; j < nums.length; j++) {
        if (nums[j] != val) {
          nums[i++] = nums[j];
        }
      }
      return i;
    }
  }
}
