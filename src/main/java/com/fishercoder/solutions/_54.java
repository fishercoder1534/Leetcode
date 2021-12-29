package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _54 {

    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/spiral-matrix/discuss/20599/Super-Simple-and-Easy-to-Understand-Solution/185257
         */
        public List<Integer> spiralOrder(int[][] matrix) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return new ArrayList<>();
            }
            int m = matrix.length;
            int n = matrix[0].length;
            List<Integer> result = new ArrayList();
            int left = 0;
            int right = n - 1;
            int top = 0;
            int bottom = m - 1;
            while (result.size() < m * n) {
                for (int j = left; j <= right && result.size() < m * n; j++) {
                    result.add(matrix[top][j]);
                }
                top++;
                for (int i = top; i <= bottom && result.size() < m * n; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
                for (int j = right; j >= left && result.size() < m * n; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
                for (int i = bottom; i >= top && result.size() < m * n; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
            return result;
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 12/29/2021.
         */
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> ans = new ArrayList<>();
            int m = matrix.length;
            int n = matrix[0].length;
            int direction = 0;
            int total = m * n;
            int j = 0;
            int i = 0;
            int lowerRow = 0;
            int lowerCol = 0;
            while (ans.size() < total) {
                for (; i < m && i >= lowerRow && j < n && j >= lowerCol; ) {
                    ans.add(matrix[i][j]);
                    if (direction == 0) {//east
                        j++;
                    } else if (direction == 1) {//south
                        i++;
                    } else if (direction == 2) {//west
                        j--;
                    } else {
                        i--;//north
                    }
                }
                if (direction == 0) {
                    i++;
                    j--;
                } else if (direction == 1) {
                    j--;
                    i--;
                } else if (direction == 2) {
                    j++;
                    i--;
                    lowerRow++;
                    m--;
                } else {
                    i++;
                    j++;
                    lowerCol++;
                    n--;
                }
                direction++;
                direction %= 4;
            }
            return ans;
        }
    }
}
