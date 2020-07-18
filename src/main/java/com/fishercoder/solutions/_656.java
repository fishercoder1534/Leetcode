package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _656 {
    public static class Solution1 {

        /**
         * Time: O(n*B)
         * Reference: https://leetcode.com/articles/coin-path/#approach-3-using-dynamic-programming-accepted
         */
        public List<Integer> cheapestJump(int[] A, int B) {
            int[] next = new int[A.length];
            long[] dp = new long[A.length];
            Arrays.fill(next, -1);
            List<Integer> res = new ArrayList();
            for (int i = A.length - 2; i >= 0; i--) {
                long minCost = Integer.MAX_VALUE;
                for (int j = i + 1; j <= i + B && j < A.length; j++) {
                    if (A[j] >= 0) {
                        long cost = A[i] + dp[j];
                        if (cost < minCost) {
                            minCost = cost;
                            next[i] = j;
                        }
                    }
                }
                dp[i] = minCost;
            }
            int i;
            for (i = 0; i < A.length && next[i] > 0; i = next[i]) {
                res.add(i + 1);
            }
            if (i == A.length - 1 && A[i] >= 0) {
                res.add(A.length);
            } else {
                return new ArrayList<>();
            }
            return res;
        }
    }
}
