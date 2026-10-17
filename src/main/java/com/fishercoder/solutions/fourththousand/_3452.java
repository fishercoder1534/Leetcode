package com.fishercoder.solutions.fourththousand;

public class _3452 {
    public static class Solution1 {
        public int sumOfGoodNumbers(int[] nums, int k) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i - k >= 0 && nums[i] > nums[i - k] && i + k < nums.length && nums[i] > nums[i + k]) {
                    sum += nums[i];
                } else if (i - k < 0) {
                    if (i + k >= nums.length) {
                        sum += nums[i];
                    } else if (nums[i] > nums[i + k]) {
                        sum += nums[i];
                    }
                } else if (i + k >= nums.length) {
                    if (i - k > 0 && nums[i] > nums[i - k]) {
                        sum += nums[i];
                    } else if (nums[i] > nums[i - k]) {
                        sum += nums[i];
                    }
                }
            }
            return sum;
        }
    }
}
