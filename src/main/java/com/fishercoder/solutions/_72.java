package com.fishercoder.solutions;

import java.util.Arrays;

public class _72 {

    public static class Solution1 {
        public int minDistance(String word1, String word2) {
            int m = word1.length();
            int n = word2.length();
            if (m == 0) {
                return n;
            }
            if (n == 0) {
                return m;
            }
            char[] str1 = word1.toCharArray();
            char[] str2 = word2.toCharArray();

            int[][] table = new int[m + 1][n + 1];
            for (int i = 0; i < m + 1; i++) {
                table[i][0] = i;
            }
            for (int j = 0; j < n + 1; j++) {
                table[0][j] = j;
            }
            for (int i = 1; i < m + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    int cost = 0;
                    if (str1[i - 1] != str2[j - 1]) {
                        cost = 1;
                    }
                    table[i][j] = Math.min(Math.min(table[i - 1][j] + 1, table[i][j - 1] + 1),
                            table[i - 1][j - 1] + cost);
                }
            }
            return table[m][n];
        }
    }

    public static class Solution2 {
        public int minDistance(String word1, String word2) {
            // using levenshtein Distance to find minimum transformation operations required from word 1 to word 2
            int[][] dp = new int[word1.length()][word2.length()];
            // fill the dp array with -1 value
            for (int[] rows : dp) {
                Arrays.fill(rows, -1);
            }
            return levenshteinDistance(word1, word1.length() - 1, word2, word2.length() - 1, dp);
        }

        private int levenshteinDistance(String s1, int s1Index, String s2, int s2Index, int[][] dp) {

            if (s1Index < 0) { // when s1 is "" perform all insertions to get s1 to s2
                return s2Index + 1;
            } else if (s2Index < 0) { // when s2 is "" perform all deletions from s1
                return s1Index + 1;
            }

            // base condition when dp array is filled, return the distance
            if (dp[s1Index][s2Index] != -1) {
                return dp[s1Index][s2Index];
            }

            if (s1.charAt(s1Index) == s2.charAt(s2Index)) {
                // Characters match, no edit distance to be calculated
                dp[s1Index][s2Index] = levenshteinDistance(s1, s1Index - 1, s2, s2Index - 1, dp);
            } else {
                // When there is a character mismatch, perform operations

                // Insertion
                int insertValue = levenshteinDistance(s1, s1Index, s2, s2Index - 1, dp);
                int deleteValue = levenshteinDistance(s1, s1Index - 1, s2, s2Index, dp);
                int substituteValue = levenshteinDistance(s1, s1Index - 1, s2, s2Index - 1, dp);

                /* Now we need to take the minimum of the 3 operations to find the edit distance and add 1 to the min cost action denoting that an action is performed */
                dp[s1Index][s2Index] = 1 + Math.min(insertValue, Math.min(deleteValue, substituteValue));
            }
            return dp[s1Index][s2Index];
        }
    }
}
