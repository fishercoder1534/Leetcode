package com.fishercoder.solutions;

/**
 * 583. Delete Operation for Two Strings
 *
 * Given two words word1 and word2, find the minimum number of steps required to make word1 and word2 the same, where in each step you can delete one character in either string.

 Example 1:
 Input: "sea", "eat"
 Output: 2

 Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".

 Note:
 The length of given words won't exceed 500.
 Characters in given words can only be lower-case letters.
 */
public class _583 {

    public static class Solution1 {

        public int minDistance(String word1, String word2) {
            int m = word1.length();
            int n = word2.length();
            int[][] dp = new int[m + 1][n + 1];
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    dp[i][j] = word1.charAt(i - 1) == word2.charAt(j - 1) ? dp[i - 1][j - 1] + 1 : Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
            return m + n - 2 * dp[m][n];
        }
    }

}
