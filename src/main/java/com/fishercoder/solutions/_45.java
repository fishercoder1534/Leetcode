package com.fishercoder.solutions;

/**
 * 45. Jump Game II
 *
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Your goal is to reach the last index in the minimum number of jumps.

 For example:
 Given array A = [2,3,1,1,4]

 The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)

 Note:
 You can assume that you can always reach the last index.

 */
public class _45 {

  public static class Solution1 {
    public int jump(int[] nums) {
      int stepCount = 0;
      int lastJumpMax = 0;
      int currentJumpMax = 0;
      for (int i = 0; i < nums.length - 1; i++) {
        currentJumpMax = Math.max(currentJumpMax, i + nums[i]);
        if (i == lastJumpMax) {
          stepCount++;
          lastJumpMax = currentJumpMax;
        }
      }
      return stepCount;
    }
  }
}
