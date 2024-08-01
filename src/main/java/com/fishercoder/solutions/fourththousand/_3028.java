package com.fishercoder.solutions.fourththousand;

public class _3028 {
    public static class Solution1 {
        public int returnToBoundaryCount(int[] nums) {
            int ans = 0;
            int pos = 0;
            for (int i = 0; i < nums.length; i++) {
                pos += nums[i];
                if (pos == 0) {
                    ans++;
                }
            }
            return ans;
        }
    }
}
