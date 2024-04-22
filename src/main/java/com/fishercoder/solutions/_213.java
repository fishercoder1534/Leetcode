package com.fishercoder.solutions;

public class _213 {
    public static class Solution1 {
        /**
         * Basically there are two ways to rob the houses: one is to rob from 0 to n - 1, the other is to rob from 1 to n, and then take the max from these two.
         * Time: O(n)
         * Space: O(n)
         */
        public int rob(int[] nums) {
            if (nums.length == 1) {
                return nums[0];
            }
            return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
        }

        private int rob(int[] nums, int start, int end) {
            int[] dp = new int[nums.length];
            dp[start] = nums[start];
            if (end - start <= 1) {
                return nums[start];
            }
            dp[start + 1] = Math.max(nums[start], nums[start + 1]);
            for (int i = start + 2; i < end; i++) {
                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            }
            return dp[end - 1];
        }
    }

    public static class Solution2 {
        /**
         * This solution is identical to the above solution 1, the only difference is that instead of using an extra array, we use only two extra variables here to reduce the space complexity to O(1).
         * Time: O(n)
         * Space: O(1)
         * <p>
         * Just draw out how this rotation works on a piece of paper, it'll be easy to figure out how first, second and tmp variables keep shifting towards the right of the array.
         */
        public int rob(int[] nums) {
            if (nums.length == 1) {
                return nums[0];
            }
            return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
        }

        private int rob(int[] nums, int start, int end) {
            int first = nums[start];
            if (end - start <= 1) {
                return first;
            }
            int second = Math.max(nums[start], nums[start + 1]);
            int tmp;
            for (int i = start + 2; i < end; i++) {
                tmp = Math.max(second, first + nums[i]);
                first = second;
                second = tmp;
            }
            return Math.max(first, second);
        }
    }
}
