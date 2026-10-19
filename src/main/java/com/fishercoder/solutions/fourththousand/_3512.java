package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;

public class _3512 {
    public static class Solution1 {
        public int minOperations(int[] nums, int k) {
            Arrays.sort(nums);
            long sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            long remainder = sum % k;
            int ops = 0;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] >= remainder) {
                    ops += remainder;
                    return ops;
                }
                ops += nums[i];
                remainder -= nums[i];
            }
            return ops;
        }
    }
}
