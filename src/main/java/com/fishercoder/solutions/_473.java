package com.fishercoder.solutions;

import java.util.Arrays;

public class _473 {

    public static class Solution1 {
        /**
         * Partially inspired by: https://discuss.leetcode.com/topic/72107/java-dfs-solution-with-explanation/2
         * One hidden requirement: you'll have to use up all of the given matchsticks, nothing could be left behind.
         */
        public boolean makesquare(int[] nums) {
            if (nums == null || nums.length < 4) {
                return false;
            }
            Arrays.sort(nums);
            reverse(nums);
            int sum = 0;
            for (int i : nums) {
                sum += i;
            }
            if (sum % 4 != 0) {
                return false;
            }

            return dfs(nums, new int[4], 0, sum / 4);
        }

        private boolean dfs(int[] nums, int[] sums, int index, int target) {
            if (index == nums.length) {
                if (sums[0] == target && sums[1] == target && sums[2] == target) {
                    return true;
                }
                return false;
            }
            for (int i = 0; i < 4; i++) {
                if (sums[i] + nums[index] > target) {
                    continue;
                }
                sums[i] += nums[index];
                if (dfs(nums, sums, index + 1, target)) {
                    return true;
                }
                sums[i] -= nums[index];
            }
            return false;
        }

        private void reverse(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
                right--;
            }
        }
    }

}
