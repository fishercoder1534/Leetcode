package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 1099. Two Sum Less Than K
 *
 * Given an array A of integers and integer K,
 * return the maximum S such that there exists i < j with A[i] + A[j] = S and S < K.
 * If no i, j exist satisfying this equation, return -1.
 *
 * Example 1:
 * Input: A = [34,23,1,24,75,33,54,8], K = 60
 * Output: 58
 * Explanation:
 * We can use 34 and 24 to sum 58 which is less than 60.
 *
 * Example 2:
 * Input: A = [10,20,30], K = 15
 * Output: -1
 * Explanation:
 * In this case it's not possible to get a pair sum less that 15.
 *
 * Note:
 * 1 <= A.length <= 100
 * 1 <= A[i] <= 1000
 * 1 <= K <= 2000
 * */
public class _1099 {
    public static class Solution1 {
        /**
         * Time: O(n^2)
         * Space: O(1)
         * */
        public int twoSumLessThanK(int[] A, int K) {
            int maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < A.length - 1; i++) {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[i] + A[j] < K) {
                        maxSum = Math.max(maxSum, A[i] + A[j]);
                    }
                }
            }
            return maxSum == Integer.MIN_VALUE ? -1 : maxSum;
        }
    }

    public static class Solution2 {
        /**
         * Time: O(nlogn)
         * Space: O(1)
         * */
        public int twoSumLessThanK(int[] A, int K) {
            Arrays.sort(A);
            int left = 0;
            int right = A.length - 1;
            int sum = Integer.MIN_VALUE;
            while (left < right) {
                int newSum = A[left] + A[right];
                if (newSum < K && newSum > sum) {
                    sum = newSum;
                } else if (newSum >= K) {
                    right--;
                } else {
                    left++;
                }
            }
            return sum == Integer.MIN_VALUE ? -1 : sum;
        }
    }
}
