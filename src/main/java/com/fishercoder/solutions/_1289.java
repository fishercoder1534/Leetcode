package com.fishercoder.solutions;

/**
 * 1289. Minimum Falling Path Sum II
 *
 * Given a square grid of integers arr, a falling path with non-zero shifts is a
 * choice of exactly one element from each row of arr, such that no two elements chosen in adjacent rows are in the same column.
 * Return the minimum sum of a falling path with non-zero shifts.
 *
 * Example 1:
 * Input: arr = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: 13
 * Explanation:
 * The possible falling paths are:
 * [1,5,9], [1,5,7], [1,6,7], [1,6,8],
 * [2,4,8], [2,4,9], [2,6,7], [2,6,8],
 * [3,4,8], [3,4,9], [3,5,7], [3,5,9]
 * The falling path with the smallest sum is [1,5,7], so the answer is 13.
 *
 * Constraints:
 * 1 <= arr.length == arr[i].length <= 200
 * -99 <= arr[i][j] <= 99
 * */
public class _1289 {
    public static class Solution1 {
        public int minFallingPathSum(int[][] arr) {
            int size = arr.length;
            int[][] dp = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == 0) {
                        dp[i][j] = arr[i][j];
                    } else {
                        int previousRowMin = Integer.MAX_VALUE;
                        for (int k = 0; k < size; k++) {
                            if (k != j) {
                                previousRowMin = Math.min(dp[i - 1][k], previousRowMin);
                            }
                        }
                        dp[i][j] = arr[i][j] + previousRowMin;
                    }
                }
            }
            int result = dp[size - 1][size - 1];
            for (int i = 0; i < size; i++) {
                result = Math.min(result, dp[size - 1][i]);
            }
            return result;
        }
    }
}
