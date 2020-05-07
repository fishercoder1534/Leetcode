package com.fishercoder.solutions;

import java.util.Arrays;

public class _85 {
    public static class Solution1 {
        public int maximalRectangle(char[][] matrix) {
            if (matrix.length == 0) {
                return 0;
            }
            int m = matrix.length;
            int n = matrix[0].length;
            int[] left = new int[n];
            int[] right = new int[n];
            int[] height = new int[n];
            Arrays.fill(left, 0);
            Arrays.fill(right, n);
            Arrays.fill(height, 0);
            int maxA = 0;
            for (int i = 0; i < m; i++) {
                int currLeft = 0;
                int currRight = n;

                //compute height, this can be achieved from either side
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == '1') {
                        height[j]++;
                    } else {
                        height[j] = 0;
                    }
                }

                //compute left, from left to right
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == '1') {
                        left[j] = Math.max(left[j], currLeft);
                    } else {
                        left[j] = 0;
                        currLeft = j + 1;
                    }
                }

                //compute right, from right to left
                for (int j = n - 1; j >= 0; j--) {
                    if (matrix[i][j] == '1') {
                        right[j] = Math.min(right[j], currRight);
                    } else {
                        right[j] = n;
                        currRight = j;
                    }
                }

                //compute rectangle area, this can be achieved from either side
                for (int j = 0; j < n; j++) {
                    maxA = Math.max(maxA, (right[j] - left[j]) * height[j]);
                }
            }
            return maxA;
        }
    }
}
