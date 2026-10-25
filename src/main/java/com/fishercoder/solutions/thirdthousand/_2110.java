package com.fishercoder.solutions.thirdthousand;

public class _2110 {
    public static class Solution1 {
        /**
         * Use this sliding window template, it's truly handy!
         * This one is almost identical to https://leetcode.com/problems/count-subarrays-with-loose-bounds/description/
         */
        public long getDescentPeriods(int[] prices) {
            long ans = 0;
            int count = 0;
            for (int i = 0; i < prices.length; i++) {
                ans++;
                if (i + 1 < prices.length && prices[i] == prices[i + 1] + 1) {
                    count++;
                    ans += count;
                } else {
                    count = 0;
                }
            }
            return ans;
        }
    }
}
