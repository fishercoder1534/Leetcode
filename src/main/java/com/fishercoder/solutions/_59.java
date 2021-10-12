package com.fishercoder.solutions;

public class _59 {

    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/spiral-matrix-ii/discuss/22289/My-Super-Simple-Solution.-Can-be-used-for-both-Spiral-Matrix-I-and-II/21907
         */
        public int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n];
            if (n == 0) {
                return matrix;
            }

            int value = 1;
            int top = 0;
            int bottom = n - 1;
            int left = 0;
            int right = n - 1;
            while (left <= right && top <= bottom) {
                for (int j = left; j <= right; j++) {
                    matrix[top][j] = value++;
                }
                top++;
                for (int i = top; i <= bottom; i++) {
                    matrix[i][right] = value++;
                }
                right--;
                for (int j = right; j >= left; j--) {
                    matrix[bottom][j] = value++;
                }
                bottom--;
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value++;
                }
                left++;
            }
            return matrix;
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 10/12/2021.
         */
        public int[][] generateMatrix(int n) {
            int direction = 0;
            int[][] matrix = new int[n][n];
            int num = 1;
            int i = 0;
            int j = 0;
            int eastBoundary = n;
            int southBoundary = n;
            int westBoundary = 0;
            int northBoundary = 0;
            int limit = n * n;
            while (num <= limit) {
                if (direction % 4 == 0) {
                    //0 means going east
                    for (; j < eastBoundary && num <= limit; j++) {
                        matrix[i][j] = num;
                        num++;
                    }
                    j--;
                    direction++;
                    eastBoundary--;
                    i++;
                }
                if (direction % 4 == 1) {
                    //1 means going south
                    for (; i < southBoundary && num <= limit; i++) {
                        matrix[i][j] = num;
                        num++;
                    }
                    i--;
                    direction++;
                    southBoundary--;
                    j--;
                }
                if (direction % 4 == 2) {
                    //2 means going west
                    for (; j >= westBoundary && num <= limit; j--) {
                        matrix[i][j] = num;
                        num++;
                    }
                    j++;
                    direction++;
                    westBoundary++;
                    i--;
                }
                if (direction % 4 == 3) {
                    //3 means going north
                    for (; i > northBoundary && num <= limit; i--) {
                        matrix[i][j] = num;
                        num++;
                    }
                    i++;
                    direction++;
                    northBoundary++;
                    j++;
                }
            }
            return matrix;
        }
    }
}
