package com.fishercoder.solutions;

public class _209 {

    public static class Solution1 {
        /**
         * A classic sliding window problem/solution.
         */
        public int minSubArrayLen(int target, int[] nums) {
            int left = 0;
            int right = 0;
            int sum = 0;
            int ans = Integer.MAX_VALUE;
            while (right < nums.length) {
                sum += nums[right];
                while (sum >= target) {
                    ans = Math.min(ans, right - left + 1);
                    sum -= nums[left];
                    left++;
                }
                right++;
            }
            return ans == Integer.MAX_VALUE ? 0 : ans;
        }
    }
}
