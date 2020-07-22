package com.fishercoder.solutions;

public class _724 {
    public static class Solution1 {
        /**
         * Space: O(n)
         * Time: O(n)
         */
        public int pivotIndex(int[] nums) {
            if (nums == null || nums.length == 0) {
                return -1;
            }
            int[] sums = new int[nums.length];
            sums[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sums[i] = sums[i - 1] + nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                if (i == 0 && 0 == sums[nums.length - 1] - sums[i] || (i > 0 && sums[i - 1] == sums[nums.length - 1] - sums[i])) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static class Solution2 {
        /**
         * Space: O(1)
         * Time: O(n)
         */
        public int pivotIndex(int[] nums) {
            int total = 0;
            for (int num : nums) {
                total += num;
            }
            int sum = 0;
            for (int i = 0; i < nums.length; sum += nums[i++]) {
                if (sum * 2 == total - nums[i]) {
                    return i;
                }
            }
            return -1;
        }
    }
}
