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
         *
         * Idea: we can keep updating these two numbers:
         * firstSmallestNumber and secondSmallestNumber
         * until we found one that's bigger than both
         */
        public boolean increasingTriplet(int[] nums) {
            int firstSmallestNumber = Integer.MAX_VALUE;
            int secondSmallestNumber = Integer.MAX_VALUE;
            for (int num : nums) {
                if (num <= firstSmallestNumber) {
                    firstSmallestNumber = num;
                } else if (num <= secondSmallestNumber) {
                    secondSmallestNumber = num;
                } else {
                    return true;
                }
            }
            return false;
        }
    }

}
