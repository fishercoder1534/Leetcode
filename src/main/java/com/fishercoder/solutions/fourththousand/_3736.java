package com.fishercoder.solutions.fourththousand;

public class _3736 {
    public static class Solution1 {
        public int minMoves(int[] nums) {
            int max = nums[0];
            for (int num : nums) {
                max = Math.max(max, num);
            }
            int minMoves = 0;
            for (int num : nums) {
                minMoves += max - num;
            }
            return minMoves;
        }
    }
}
