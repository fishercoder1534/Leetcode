package com.fishercoder.solutions;

public class _162 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/29329/java-solution-and-explanation-using-invariants
         * <p>
         * Basically, we need to keep this invariant:
         * nums[left] > nums[left-1], then we could return left as the result
         * or nums[right] > nums[right+1], then we could return right as the result
         * <p>
         * Time: O(logn)
         */
        public int findPeakElement(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int left = 0;
            int right = nums.length - 1;
            while (left + 1 < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] < nums[mid + 1]) {
                    left = mid;
                } else {
                    right = mid;
                }
            }
            return (left == nums.length - 1 || nums[left] > nums[left + 1]) ? left : right;
        }
    }

    public static class Solution2 {
        /**
         * My original O(n) solution.
         */
        public int findPeakElement(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1] && i + 1 < nums.length && nums[i] > nums[i + 1]) {
                    return i;
                }
                if (i == nums.length - 1 && nums[i] > nums[i - 1]) {
                    return i;
                }
            }
            return 0;
        }
    }
}
