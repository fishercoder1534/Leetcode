package com.fishercoder.solutions;

public class _74 {

    public static class Solution1 {
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0
                    || matrix[0].length == 0
                    || matrix[0][0] > target
                    || matrix[matrix.length - 1][matrix[0].length - 1] < target) {
                return false;
            }
            int m = matrix.length;
            int n = matrix[0].length;
            int left = 0;
            int right = m * n - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                int row = mid / n;
                int col = mid % n;
                if (matrix[row][col] == target) {
                    return true;
                } else if (matrix[row][col] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return false;
        }
    }
}
