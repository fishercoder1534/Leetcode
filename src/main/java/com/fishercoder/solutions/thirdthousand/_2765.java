package com.fishercoder.solutions.thirdthousand;

public class _2765 {
    public static class Solution1 {
        public int alternatingSubarray(int[] nums) {
            int len = nums.length;
            int maxLen = -1;
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
                    if (j - i + 1 > maxLen && alternating(nums, i, j)) {
                        maxLen = j - i + 1;
                    }
                }
            }
            return maxLen;
        }

        private boolean alternating(int[] nums, int start, int finish) {
            int expected = 1;
            for (int i = start, j = start + 1; i < finish && j <= finish; i++, j++) {
                if (nums[j] - nums[i] == expected) {
                    expected = -expected;
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}
