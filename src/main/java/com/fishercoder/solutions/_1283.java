package com.fishercoder.solutions;

public class _1283 {
    public static class Solution {

        public int smallestDivisor(int[] nums, int threshold) {

            int start = 1;
            int result = 0;
            int end = Integer.MAX_VALUE;
            while (start <= end) {
                int middle = start + (end - start) / 2;
                if (isSumLessThanThreshold(middle, nums, threshold)) {
                    result = middle;
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
            return result;
        }

        private boolean isSumLessThanThreshold(int middle, int[] nums, int threshold) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % middle == 0) {
                    sum += nums[i] / middle;
                } else {
                    sum += nums[i] / middle + 1;
                }
            }
            return sum <= threshold;
        }
    }
}
