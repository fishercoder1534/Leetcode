package com.fishercoder.solutions;

public class _1150 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/check-if-a-number-is-majority-element-in-a-sorted-array/discuss/358130/Java-just-one-binary-search-O(logN))-0ms-beats-100
         */
        public boolean isMajorityElement(int[] nums, int target) {
            int firstIndex = findFirstOccur(nums, target);
            int plusHalfIndex = firstIndex + nums.length / 2;
            return plusHalfIndex < nums.length && nums[plusHalfIndex] == target;
        }

        private int findFirstOccur(int[] nums, int target) {
            int left = 0;
            int right = nums.length;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] < target) {
                    left = mid + 1;
                } else if (nums[mid] >= target) {
                    right = mid;
                }
            }
            return left;
        }
    }
}
