package com.fishercoder.solutions.first_thousand;

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

    public static class Solution2 {
        /**
         * This is a more generic solution adapted from https://leetcode.com/problems/max-consecutive-ones-iii/, just set k = 1 here.
         */
        public static int findMaxConsecutiveOnes(int[] nums) {
            int len = nums.length;
            int left = 0;
            int right = 0;
            int ans = 0;
            int k = 1;
            for (; right < len; right++) {
                if (nums[right] == 0) {
                    k--;
                }
                while (k < 0) {
                    if (nums[left] == 0) {
                        k++;
                    }
                    left++;
                }
                ans = Math.max(ans, right - left + 1);
            }
            return ans;
        }
    }
}
