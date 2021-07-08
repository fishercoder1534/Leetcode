package com.fishercoder.solutions;

public class _1143 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/longest-common-subsequence/solution/
         * <p>
         * Recall that there are two different techniques we can use to implement a dynamic programming solution; memoization and tabulation.
         * <p>
         * Memoization is where we add caching to a function (that has no side effects). In dynamic programming, it is typically used on recursive functions for a top-down solution that starts with the initial problem and then recursively calls itself to solve smaller problems.
         * Tabulation uses a table to keep track of subproblem results and works in a bottom-up manner: solving the smallest subproblems before the large ones, in an iterative manner. Often, people use the words "tabulation" and "dynamic programming" interchangeably.
         * <p>
         * For most people, it's easiest to start by coming up with a recursive brute-force solution and then adding memoization to it. After that, they then figure out how to convert it into an (often more desired) bottom-up tabulated algorithm.
         */
        public int longestCommonSubsequence(String text1, String text2) {
            if (text1 == null || text1.length() == 0 || text2 == null || text2.length() == 0) {
                return 0;
            }
            int m = text1.length();
            int n = text2.length();
            int[][] dp = new int[m + 1][n + 1];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j] = -1;
                }
            }
            return topDownRecursiveSolve(dp, 0, 0, text1, text2);
        }

        private int topDownRecursiveSolve(int[][] dp, int i, int j, String text1, String text2) {
            if (dp[i][j] != -1) {
                return dp[i][j];
            }
            //option1: we don't include text1.charAt(i) in the optimal solution
            int option1 = topDownRecursiveSolve(dp, i + 1, j, text1, text2);
            //option2: we do include text1.charAt(i) in the optimal solution as long as a match in text2 at or after j does exist
            int firstOccurence = text2.indexOf(text1.charAt(i), j);
            int option2 = 0;
            if (firstOccurence != -1) {
                option2 = 1 + topDownRecursiveSolve(dp, i + 1, firstOccurence + 1, text1, text2);
            }
            dp[i][j] = Math.max(option1, option2);
            return dp[i][j];
        }
    }
}
