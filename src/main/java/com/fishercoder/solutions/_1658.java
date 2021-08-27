package com.fishercoder.solutions;

public class _1658 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/discuss/936074/JavaPython-3-Sliding-window%3A-Longest-subarray-sum-to-the-target-sum(nums)-x.
         */
        public int minOperations(int[] nums, int x) {
            int sum = 0;
            for (int n : nums) {
                sum += n;
            }
            int target = sum - x;
            int len = nums.length;
            int size = Integer.MIN_VALUE;
            for (int left = -1, right = 0, windowSum = 0; right < len; right++) {
                windowSum += nums[right];
                while (left + 1 < len && windowSum > target) {
                    left++;
                    windowSum -= nums[left];
                }
                if (windowSum == target) {
                    size = Math.max(size, right - left);
                }
            }
            return size < 0 ? -1 : len - size;
        }

    }
}
