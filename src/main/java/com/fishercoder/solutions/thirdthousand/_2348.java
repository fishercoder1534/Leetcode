package com.fishercoder.solutions.thirdthousand;

public class _2348 {
    public static class Solution1 {
        public long zeroFilledSubarray(int[] nums) {
            long count = 0;
            long consecutive = 0;
            for (int num : nums) {
                if (num == 0) {
                    consecutive++;
                    count += consecutive;
                } else {
                    consecutive = 0;
                }
            }
            return count;
        }
    }
}
