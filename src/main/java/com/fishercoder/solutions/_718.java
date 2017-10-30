package com.fishercoder.solutions;

/**
 * 718. Maximum Length of Repeated Subarray
 *
 * Given two integer arrays A and B, return the maximum length of an subarray that appears in both arrays.

 Example 1:
 Input:
 A: [1,2,3,2,1]
 B: [3,2,1,4,7]
 Output: 3

 Explanation:
 The repeated subarray with maximum length is [3, 2, 1].
 Note:
 1 <= len(A), len(B) <= 1000
 0 <= A[i], B[i] < 100
 */
public class _718 {
    public static class Solution1 {
        public int findLength(int[] A, int[] B) {
            if (A == null || B == null || A.length == 0 || B.length == 0) {
                return 0;
            }
            int[][] dp = new int[A.length + 1][B.length + 1];
            int result = 0;
            for (int i = A.length - 1; i >= 0; i--) {
                for (int j = B.length - 1; j >= 0; j--) {
                    if (A[i] == B[j]) {
                        dp[i][j] = dp[i + 1][j + 1] + 1;
                    }
                    result = Math.max(result, dp[i][j]);
                }
            }
            return result;
        }
    }
}
