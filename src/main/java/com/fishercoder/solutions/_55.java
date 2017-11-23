package com.fishercoder.solutions;

/**
 * 55. Jump Game
 *
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Determine if you are able to reach the last index.
 *
 * For example:
 * A = [2,3,1,1,4], return true.
 * A = [3,2,1,0,4], return false.*/
public class _55 {

    public static class Solution1 {
        public boolean canJump(int[] nums) {
            int farthest = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (i <= farthest && nums[i] + i > farthest) {
                    //i <= farthest is to make sure that this current i is within the current range
                    // nums[i]+i > farthest is to make sure that it's necessary to update farthest with current nums[i]+i
                    farthest = nums[i] + i;
                }
            }
            return farthest >= nums.length - 1;
        }
    }
}
