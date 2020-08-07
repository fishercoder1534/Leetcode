package com.fishercoder.solutions;

import java.util.Arrays;

public class _1099 {
    public static class Solution1 {
        /**
         * Time: O(n^2)
         * Space: O(1)
         */
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
         */
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
