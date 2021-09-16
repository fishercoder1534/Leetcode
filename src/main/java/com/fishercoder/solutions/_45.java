package com.fishercoder.solutions;

public class _45 {
    public static class Solution1 {
        public int jump(int[] nums) {
            int jumps = 0;
            int lastJumpMax = 0;
            int currentJumpMax = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                currentJumpMax = Math.max(currentJumpMax, i + nums[i]);
                if (i == lastJumpMax) {
                    jumps++;
                    lastJumpMax = currentJumpMax;
                }
                if (lastJumpMax >= nums.length) {
                    return jumps;
                }
            }
            return jumps;
        }
    }
}
