package com.fishercoder.solutions;

public class _308 {
    public static class Solution1 {
        public class NumMatrix {
            int[][] nums;
            int[][] tree;
            int height;
            int width;

            public NumMatrix(int[][] matrix) {
                if (matrix.length == 0 || matrix[0].length == 0) {
                    return;
                }
                height = matrix.length;
                width = matrix[0].length;
                this.nums = new int[height][width];
                this.tree = new int[height + 1][width + 1];
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        update(i, j, matrix[i][j]);
                    }
                }
            }

            public void update(int rowIndex, int colIndex, int newVal) {
                if (height == 0 || width == 0) {
                    return;
                }
                int delta = newVal - nums[rowIndex][colIndex];
                nums[rowIndex][colIndex] = newVal;
                for (int i = rowIndex + 1; i <= height; i += i & (-i)) {
                    for (int j = colIndex + 1; j <= width; j += j & (-j)) {
                        tree[i][j] += delta;//just use its previous value plus delta is good
                    }
                }
            }

            public int sumRegion(int row1, int col1, int row2, int col2) {
                if (height == 0 || width == 0) {
                    return 0;
                }
                return sum(row2 + 1, col2 + 1) + sum(row1, col1) - sum(row1, col2 + 1) - sum(
                        row2 + 1, col1);
            }

            private int sum(int row, int col) {
                int sum = 0;
                for (int i = row; i > 0; i -= i & (-i)) {
                    for (int j = col; j > 0; j -= j & (-j)) {
                        sum += tree[i][j];
                    }
                }
                return sum;
            }
        }

        /**
         * Your NumMatrix object will be instantiated and called as such:
         * NumMatrix obj = new NumMatrix(matrix);
         * obj.update(row,col,val);
         * int param_2 = obj.sumRegion(row1,col1,row2,col2);
         */
    }
}
