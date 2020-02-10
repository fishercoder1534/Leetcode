package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 1349. Maximum Students Taking Exam
 *
 * Given a m * n matrix seats  that represent seats distributions in a classroom.
 * If a seat is broken, it is denoted by '#' character otherwise it is denoted by a '.' character.
 * Students can see the answers of those sitting next to the left, right, upper left and upper right, but he cannot see the answers of the student sitting directly in front or behind him. Return the maximum number of students that can take the exam together without any cheating being possible..
 * Students must be placed in seats in good condition.
 *
 * Example 1:
 * Input: seats = [["#",".","#","#",".","#"],
 *                 [".","#","#","#","#","."],
 *                 ["#",".","#","#",".","#"]]
 * Output: 4
 * Explanation: Teacher can place 4 students in available seats so they don't cheat on the exam.
 *
 * Example 2:
 * Input: seats = [[".","#"],
 *                 ["#","#"],
 *                 ["#","."],
 *                 ["#","#"],
 *                 [".","#"]]
 * Output: 3
 * Explanation: Place all students in available seats.
 *
 * Example 3:
 * Input: seats = [["#",".",".",".","#"],
 *                 [".","#",".","#","."],
 *                 [".",".","#",".","."],
 *                 [".","#",".","#","."],
 *                 ["#",".",".",".","#"]]
 * Output: 10
 * Explanation: Place students in available seats in column 1, 3 and 5.
 *
 * Constraints:
 * seats contains only characters '.' and'#'.
 * m == seats.length
 * n == seats[i].length
 * 1 <= m <= 8
 * 1 <= n <= 8
 * */
public class _1349 {
    public static class Solution1 {
        /**credit: https://leetcode.com/problems/maximum-students-taking-exam/discuss/503686/A-simple-tutorial-on-this-bitmasking-problem*/
        public int maxStudents(char[][] seats) {
            int m = seats.length;
            int n = seats[0].length;
            int[] validRows = new int[m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    validRows[i] = (validRows[i] << 1) + (seats[i][j] == '.' ? 1 : 0);
                }
            }
            int stateSize = 1 << n; // There are 2^n states for n columns in binary format
            int[][] dp = new int[m][stateSize];
            for (int i = 0; i < m; i++) {
                Arrays.fill(dp[i], -1);
            }
            int ans = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < stateSize; j++) {
                    if (((j & validRows[i]) == j) && ((j & (j << 1)) == 0)) {
                        if (i == 0) {
                            dp[i][j] = Integer.bitCount(j);
                        } else {
                            for (int k = 0; k < stateSize; k++) {
                                if (((k << 1) & j) == 0 && ((j << 1) & k) == 0 && dp[i - 1][k] != -1) {
                                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + Integer.bitCount(j));
                                }
                            }
                        }
                        ans = Math.max(ans, dp[i][j]);
                    }
                }
            }
            return ans;
        }
    }
}
