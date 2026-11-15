package com.fishercoder.solutions.fifththousand;

public class _4111 {
    public static class Solution1 {
        public int countConsistent(int[] nums) {
            int ans = 0;
            int len = 1;
            while (len <= nums.length) {
                for (int i = 0; i <= (nums.length - len); i++) {
                    int bitAnd = nums[i];
                    int min = nums[i];
                    int j = i + 1;
                    for (; j < nums.length && j - i + 1 <= len; j++) {
                        bitAnd &= nums[j];
                        min = Math.min(min, nums[j]);
                    }
                    if (bitAnd == min) {
                        ans++;
                    }
                }
                len++;
            }
            return ans;
        }
    }
}
