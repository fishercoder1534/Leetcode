package com.fishercoder.solutions;

import java.util.Arrays;

public class _2012 {
    public static class Solution1 {
        public int sumOfBeauties(int[] nums) {
            int[] preMax = new int[nums.length];
            preMax[0] = nums[0];
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                max = Math.max(max, nums[i]);
                preMax[i] = max;
            }
            int[] postMin = new int[nums.length];
            Arrays.fill(postMin, Integer.MAX_VALUE);
            int min = nums[nums.length - 1];
            postMin[nums.length - 1] = nums[nums.length - 1];
            for (int i = nums.length - 2; i >= 0; i--) {
                min = Math.min(min, nums[i]);
                postMin[i] = min;
            }
            int sum = 0;
            for (int i = 1; i <= nums.length - 2; i++) {
                if (nums[i] > preMax[i - 1] && nums[i] < postMin[i + 1]) {
                    sum += 2;
                } else if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
                    sum++;
                }
            }
            return sum;
        }
    }
}
