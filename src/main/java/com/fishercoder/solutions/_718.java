package com.fishercoder.solutions;

import java.util.Arrays;

public class _718 {
    public static class Solution1 {
        /**
         * This brute force idea results in TLE.
         */
        public int findLength(int[] nums1, int[] nums2) {
            int[] shorter = nums1.length < nums2.length ? nums1 : nums2;
            int[] longer = nums1.length < nums2.length ? nums2 : nums1;
            int maxLen = 0;
            for (int i = 0; i < shorter.length - 1; i++) {
                for (int j = shorter.length; j >= 0 && j > i && j - i > maxLen; j--) {
                    int[] candidate = Arrays.copyOfRange(shorter, i, j);
                    if (candidate.length > maxLen && isSubarray(candidate, longer)) {
                        maxLen = candidate.length;
                    }
                }
            }
            return maxLen;
        }

        private boolean isSubarray(int[] candidate, int[] array) {
            for (int i = 0; i <= array.length - candidate.length; i++) {
                if (Arrays.equals(candidate, Arrays.copyOfRange(array, i, i + candidate.length))) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class Solution2 {
        /**
         * DP approach:
         * credit: https://leetcode.com/problems/maximum-length-of-repeated-subarray/solution/
         * 1. we initialize a 2D matrix as the cash to hold values, initially, all are zeroes,
         * the number of rows of this matrix is the length of nums1 plus one and the number of columns is the length of nums2 plus one;
         * 2. Since a common subarray of A and B must start at some A[i] and B[j], let dp[i][j] be the longest common prefix of A[i:] and B[j:].
         * Whenever A[i] == B[j], we know dp[i][j] = dp[i+1][j+1] + 1. Also, the answer is max(dp[i][j]) over all i, j.
         *
         * We can perform bottom-up dynamic programming to find the answer based on this recurrence.
         * Our loop invariant is that the answer is already calculated correctly and stored in dp for any larger i, j.
         */
        public int findLength(int[] nums1, int[] nums2) {
            if (nums1 == null || nums2 == null) {
                return 0;
            }
            int m = nums1.length;
            int n = nums2.length;
            int max = 0;
            int[][] dp = new int[m + 1][n + 1];
            for (int i = m - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    if (nums1[i] == nums2[j]) {
                        dp[i][j] = dp[i + 1][j + 1] + 1;
                        max = Math.max(max, dp[i][j]);
                    }
                }
            }
            return max;
        }
    }

}
