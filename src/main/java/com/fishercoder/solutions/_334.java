package com.fishercoder.solutions;

public class _334 {

    public static class Solution1 {
        /**
         * Time: O(n^2)
         * Space: O(1)
         */
        public boolean increasingTriplet(int[] nums) {
            if (nums == null || nums.length == 0) {
                return false;
            }
            int small = nums[0];
            int medium = Integer.MAX_VALUE;
            for (int i = 1; i < nums.length; i++) {
                small = Math.min(small, nums[i - 1]);
                if (nums[i] > small) {
                    medium = Math.min(medium, nums[i]);
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[j] > nums[i] || nums[j] > medium) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public static class Solution2 {
        /**
         * Time: O(n)
         * Space: O(1)
         */
        public boolean increasingTriplet(int[] nums) {
            int small = Integer.MAX_VALUE;
            int big = Integer.MAX_VALUE;
            for (int num : nums) {
                if (num <= small) {
                    small = num;
                } else if (num <= big) {
                    big = num;
                } else {
                    return true;
                }
            }
            return false;
        }
    }

}
