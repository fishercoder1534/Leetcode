package com.fishercoder.solutions;

public class _1991 {
    public static class Solution1 {
        public int findMiddleIndex(int[] nums) {
            int middleIndex = -1;
            long sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            long leftSum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum -= nums[i];
                if (i > 0) {
                    leftSum += nums[i - 1];
                }
                if (sum == leftSum) {
                    return i;
                }
            }
            return middleIndex;
        }
    }
}
