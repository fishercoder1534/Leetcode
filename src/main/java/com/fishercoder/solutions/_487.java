package com.fishercoder.solutions;

public class _487 {

    public static class Solution1 {
        /**
         * I implemented this on my own after a quick read from https://leetcode.com/problems/max-consecutive-ones-ii/solution/
         */
        public static int findMaxConsecutiveOnes(int[] nums) {
            int left = 0;
            int right = 0;
            int zeroes = 0;
            int ans = 0;
            while (right < nums.length) {
                if (nums[right] == 0) {
                    zeroes++;
                }
                if (zeroes <= 1) {
                    ans = Math.max(ans, right - left + 1);
                } else {
                    while (left < nums.length && zeroes > 1) {
                        if (nums[left] == 0) {
                            zeroes--;
                        }
                        left++;
                    }
                }
                right++;
            }
            return ans;
        }
    }
}
