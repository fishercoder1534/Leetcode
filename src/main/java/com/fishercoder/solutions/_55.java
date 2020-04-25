package com.fishercoder.solutions;

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
