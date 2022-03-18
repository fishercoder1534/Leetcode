package com.fishercoder.solutions;

public class _2090 {
    public static class Solution1 {
        public int[] getAverages(int[] nums, int k) {
            if (k == 0) {
                return nums;
            }
            long[] preSums = new long[nums.length];
            preSums[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                preSums[i] = preSums[i - 1] + nums[i];
            }
            int[] ans = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (i - k < 0) {
                    ans[i] = -1;
                } else if (i + k >= nums.length) {
                    ans[i] = -1;
                } else {
                    if (i - k == 0) {
                        ans[i] = (int) (preSums[i + k] / (2 * k + 1));
                    } else {
                        ans[i] = (int) ((preSums[i + k] - preSums[i - k - 1]) / (2 * k + 1));
                    }
                }
            }
            return ans;
        }
    }
}
