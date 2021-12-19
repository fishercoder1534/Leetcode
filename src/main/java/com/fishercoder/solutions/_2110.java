package com.fishercoder.solutions;

public class _2110 {
    public static class Solution1 {
        public long getDescentPeriods(int[] prices) {
            long ans = prices.length;
            for (int i = 0; i < prices.length; i++) {
                long startI = i;
                while (i + 1 < prices.length && prices[i] - 1 == prices[i + 1]) {
                    i++;
                }
                long totalNum = i - startI + 1;
                if (totalNum > 1) {
                    ans += ((totalNum - 1) * totalNum) / 2;
                }
            }
            return ans;
        }
    }
}
