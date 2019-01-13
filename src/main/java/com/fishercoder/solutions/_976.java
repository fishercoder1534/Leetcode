package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 976. Largest Perimeter Triangle
 *
 * Given an array A of positive lengths, return the largest perimeter of a triangle with non-zero area, formed from 3
 * of these lengths.
 *
 * If it is impossible to form any triangle of non-zero area, return 0.
 * */

public class _976 {

    public static class Solution1 {
        public int largestPerimeter(int[] A) {
            Arrays.sort(A);
            int n = A.length;

            for (int i = n - 1; i > 1; i--) {
                if (A[i] < A[i - 1] + A[i - 2]) {
                    return A[i] + A[i - 1] + A[i - 2];
                }
            }

            return 0;
        }
    }
}
