package com.fishercoder.solutions;

public class _651 {

    public static class Solution1 {
        /**
         * Minimum needs to be more than 3 A's in a row, otherwise "Ctrl A, Ctrl C, Ctrl V" will make fewer A's than directly
         * copying A's with the equal number of steps.
         * E.g. when n == 5,
         * if we do 5 this: A, A, Ctrl A, Ctrl C, Ctrl V, => this will result in only AAAA (4 A's)
         * while if we do A, A, A, A, A, => this will result in AAAAA (5 A's)
         * So, at a minimum, we need to have 3 A's, then it's worth to do "Ctrl A, Ctrl C, Ctrl V"..
         * That's why we have j = 3 in the inner for loop below.
         */
        public int maxA(int N) {
            int[] dp = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                dp[i] = i;
                for (int j = 3; j < i; j++) {
                    dp[i] = Math.max(dp[i], dp[i - j] * (j - 1));
                }
            }
            return dp[N];
        }
    }

}
