package com.fishercoder.solutions;

import java.util.Arrays;

public class _727 {
    public static class Solution1 {
        /**
         * This naive brute force results in TLE.
         */
        public String minWindow(String S, String T) {
            String result = S;
            for (int i = 0; i < S.length(); i++) {
                for (int j = i + T.length(); j <= S.length(); j++) {
                    String sub = S.substring(i, j);
                    if (sub.length() < result.length() && isSubsequence(T, sub)) {
                        result = sub;
                    }
                }
            }
            return result.equals(S) ? "" : result;
        }

        private boolean isSubsequence(String T, String sub) {
            int i = 0;
            for (int j = 0; i < T.length() && j < sub.length(); j++) {
                if (T.charAt(i) == sub.charAt(j)) {
                    i++;
                }
            }
            return i == T.length();
        }
    }

    public static class Solution2 {
        /**
         * credit: https://github.com/lydxlx1/LeetCode/blob/master/src/_727.java
         */
        public String minWindow(String S, String T) {
            int[][] dp = new int[S.length() + 1][T.length() + 1];
            int INFINITY = 1 << 29;
            Arrays.fill(dp[0], INFINITY);
            dp[0][0] = 0;
            for (int i = 1; i <= S.length(); i++) {
                for (int j = 1; j <= T.length(); j++) {
                    dp[i][j] = dp[i - 1][j] + 1;
                    if (S.charAt(i - 1) == T.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                }
            }
            int ans = INFINITY;
            int tail = -1;
            for (int i = 1; i <= S.length(); i++) {
                if (dp[i][T.length()] < ans) {
                    ans = dp[i][T.length()];
                    tail = i;
                }
            }
            return ans == INFINITY ? "" : S.substring(tail - ans, tail);
        }

    }
}
