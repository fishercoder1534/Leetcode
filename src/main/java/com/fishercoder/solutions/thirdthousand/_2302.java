package com.fishercoder.solutions.thirdthousand;

public class _2302 {
    public static class Solution1 {
        /**
         * Once you master the sliding window strategy, this HARD problem is actually a pretty standard medium problem. :)
         */
        public long countSubarrays(int[] nums, long k) {
            long ans = 0;
            int left = 0;
            long runningSum = 0;
            for (int right = 0; right < nums.length; right++) {
                //expand the sliding window
                runningSum += nums[right];

                //shrink the window from the left while the score is invalid
                while (left <= right && runningSum * (right - left + 1) >= k) {
                    runningSum -= nums[left++];
                }

                ans += right - left + 1;
            }
            return ans;
        }
    }
}
