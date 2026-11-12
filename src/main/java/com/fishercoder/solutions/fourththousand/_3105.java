package com.fishercoder.solutions.fourththousand;

public class _3105 {
    public static class Solution1 {
        public int longestMonotonicSubarray(int[] nums) {
            int ans = 1;
            for (int i = 0; i < nums.length - 1; i++) {
                int j = i;
                while (j + 1 < nums.length && nums[j] < nums[j + 1]) {
                    j++;
                }
                ans = Math.max(ans, j - i + 1);
                i = j;
            }

            for (int i = 0; i < nums.length - 1; i++) {
                int j = i;
                while (j + 1 < nums.length && nums[j] > nums[j + 1]) {
                    j++;
                }
                ans = Math.max(ans, j - i + 1);
                i = j;
            }
            return ans;
        }
    }
}
