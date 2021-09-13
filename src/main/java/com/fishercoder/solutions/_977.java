package com.fishercoder.solutions;

import java.util.Arrays;

public class _977 {
    public static class Solution1 {
        /**
         * O(nlogn) solution
         */
        public int[] sortedSquares(int[] nums) {
            int[] result = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                result[i] = (int) Math.pow(nums[i], 2);
            }
            Arrays.sort(result);
            return result;
        }
    }

    public static class Solution2 {
        /**
         * O(n) solution
         */
        public int[] sortedSquares(int[] nums) {
            int[] ans = new int[nums.length];
            for (int i = nums.length - 1, left = 0, right = nums.length - 1; i < nums.length && left <= right; i--) {
                if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                    ans[i] = nums[right] * nums[right];
                    right--;
                } else {
                    ans[i] = nums[left] * nums[left];
                    left++;
                }
            }
            return ans;
        }
    }
}
