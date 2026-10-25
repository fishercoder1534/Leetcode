package com.fishercoder.solutions.firstthousand;

public class _930 {
    public static class Solution1 {
        public int numSubarraysWithSum(int[] nums, int goal) {
            int ans = 0;
            int left = 0;
            int sum = 0;
            int prefixZeroes = 0; // track the number of zeroes in front of a valid sliding window
            for (int right = 0; right < nums.length; right++) {
                sum += nums[right];
                while (left < right && sum > goal) {
                    sum -= nums[left++];
                    prefixZeroes = 0;
                }

                //if we hit a zero at the left side and it's a valid window, we can keep moving left without changing the sum, this is different from the above while loop
                while (left < right && sum == goal && nums[left] == 0) {
                    left++;
                    prefixZeroes++;
                }

                if (sum == goal) {
                    ans += prefixZeroes + 1;
                }
            }
            return ans;
        }
    }

    public static class Solution2 {
        /**
         * THE "AT MOST" TRICK (Set Subtraction)
         * <p>
         * Formula: Exactly(K) = AtMost(K) - AtMost(K - 1)
         * <p>
         * When asked to find the number of subarrays matching EXACTLY a target 'goal',
         * it can often be incredibly tricky to track directly due to duplicate values
         * or zeros. This trick solves a much easier problem twice using basic set subtraction.
         * <p>
         * Visual Representation of atMost(goal):
         * ┌──────────────────────────────────────┬───────────────┐
         * │                                      │               │
         * │              atMost(goal-1)          │  Exactly goal │
         * │           (Sums from 0 to goal-1)    │               │
         * │                                      │               │
         * └──────────────────────────────────────┴───────────────┘
         * └─────────────────────────── atMost(goal) ─────────────┘
         * <p>
         * By finding all subarrays with a sum of AT MOST 'goal' and subtracting
         * all subarrays with a sum of AT MOST 'goal - 1', the remainder is
         * exactly the count of subarrays that sum up to 'goal'.
         */

        public int numSubarraysWithSum(int[] nums, int goal) {
            return atMost(nums, goal) - atMost(nums, goal - 1);
        }

        private int atMost(int[] nums, int goal) {
            if (goal < 0) {
                return 0;
            }
            int left = 0;
            int sum = 0;
            int ans = 0;
            for (int right = 0; right < nums.length; right++) {
                sum += nums[right];
                while (sum > goal) {
                    sum -= nums[left++];
                }
                ans += right - left + 1;
            }
            return ans;
        }
    }
}
