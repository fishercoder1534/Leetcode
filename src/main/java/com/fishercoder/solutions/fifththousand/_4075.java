package com.fishercoder.solutions.fifththousand;

public class _4075 {
    public static class Solution1 {
        public int resilientSubarray(int[] nums, int k) {
            int maxLen = 0;
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                int sum = 0;
                int targetRem = (nums[i] % k + k) % k;

                for (int j = i; j < len; j++) {
                    int currRem = (nums[j] % k + k) % k;

                    if (currRem != targetRem) {
                        break;
                    }
                    sum += nums[j];

                    if ((sum - targetRem) % k == 0) {
                        maxLen = Math.max(maxLen, j - i + 1);
                    }
                }
            }
            return maxLen;
        }
    }
}
