package com.fishercoder.solutions;

public class _162 {

    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/find-peak-element/solutions/1290642/intuition-behind-conditions-complete-explanation-diagram-binary-search/
         * Time: O(logn)
         * <p>
         * draw three cases with three examples, it's pretty self-explanatory
         */
        public int findPeakElement(int[] nums) {
            if (nums == null || nums.length <= 1 || nums[0] > nums[1]) {
                return 0;
            }
            if (nums[nums.length - 1] > nums[nums.length - 2]) {
                return nums.length - 1;
            }
            int left = 1;
            int right = nums.length - 2;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                    return mid;
                } else if (nums[mid] < nums[mid - 1]) {
                    right = mid - 1;
                } else if (nums[mid] < nums[mid + 1]) {
                    left = mid + 1;
                }
            }
            return -1;
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
