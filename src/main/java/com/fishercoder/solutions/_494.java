package com.fishercoder.solutions;

public class _494 {

    public static class Solution1 {
        public int findTargetSumWays(int[] nums, int S) {
            return find(0, nums, S);
        }

        private int find(int p, int[] nums, int sum) {
            if (p == nums.length) {
                if (sum == 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
            return find(p + 1, nums, sum + nums[p]) + find(p + 1, nums, sum - nums[p]);
        }
    }

}