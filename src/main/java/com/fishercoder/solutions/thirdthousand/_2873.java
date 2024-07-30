package com.fishercoder.solutions.thirdthousand;

public class _2873 {
    public static class Solution1 {
        public long maximumTripletValue(int[] nums) {
            long ans = Long.MIN_VALUE;
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        ans = Math.max(ans, (long) (nums[i] - nums[j]) * nums[k]);
                    }
                }
            }
            if (ans < 0) {
                return 0;
            }
            return ans;
        }
    }
}
