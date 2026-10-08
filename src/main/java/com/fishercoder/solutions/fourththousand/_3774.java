package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;

public class _3774 {
    public static class Solution1 {
        public int absDifference(int[] nums, int k) {
            Arrays.sort(nums);
            long sumKLargest = 0;
            int kTimes = k;
            for (int i = nums.length - 1; i >= 0 && kTimes > 0; i--, kTimes--) {
                sumKLargest += nums[i];
            }
            kTimes = k;
            long sumKSmallest = 0;
            for (int i = 0; i < nums.length && kTimes > 0; i++, kTimes--) {
                sumKSmallest += nums[i];
            }
            return (int) (sumKLargest - sumKSmallest);
        }
    }
}
