package com.fishercoder.solutions;

public class _634 {
    public static class Solution1 {
        /**
         * reference: https://discuss.leetcode.com/topic/94442/java-5-lines-o-1-space-solution
         * and https://leetcode.com/articles/find-derangements/#approach-5-using-formula-accepted
         */
        private static final int M = 1000000007;

        public int findDerangement(int n) {
            long ans = 1;
            for (int i = 1; i <= n; i++) {
                ans = (i * ans % M + (i % 2 == 0 ? 1 : -1)) % M;
            }
            return (int) ans;
        }
    }
}
