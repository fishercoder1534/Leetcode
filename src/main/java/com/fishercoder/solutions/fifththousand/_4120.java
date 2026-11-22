package com.fishercoder.solutions.fifththousand;

public class _4120 {
    public static class Solution1 {
        public int countDominantElements(int[] nums) {
            int ans = 0;
            if (nums.length == 1) {
                return 1;
            }
            for (int i = 0; i < nums.length; i++) {
                if (i == 0) {
                    if (nums[i] >= nums[i + 1]) {
                        ans++;
                    }
                } else if (i == nums.length - 1) {
                    if (nums[i] >= nums[i - 1]) {
                        ans++;
                    }
                } else {
                    double ave = (double) (nums[i + 1] + nums[i - 1]) / 2;
                    if (nums[i] >= ave) {
                        ans++;
                    }
                }
            }
            return ans;
        }
    }
}
