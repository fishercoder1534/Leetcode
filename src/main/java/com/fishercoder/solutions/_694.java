package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _694 {
    public static class Solution1 {
        /**
         * My original idea:
         * my not fully working yet: the equals() and hashcode() methods need to be refined
         * because HashSet is not really filtering the islands wiht the same shape.
         */
        class Quadrilateral {
            int[] topLeft;
            int[] bottomLeft;
            int[] topRight;
            int[] bottomRight;
            int area;

            public Quadrilateral(int i, int j) {
                this.area = 0;
                this.topLeft = new int[]{i, j};
                this.topRight = new int[]{i, j};
                this.bottomLeft = new int[]{i, j};
                this.bottomRight = new int[]{i, j};
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof Quadrilateral)) {
                    return false;
                }

                Quadrilateral that = (Quadrilateral) o;
                return this.area == that.area && checkDistance(that);
            }

            private boolean checkDistance(Quadrilateral that) {
                int thisTop = computeDistance(this.topLeft, this.topRight);
                int thatTop = computeDistance(that.topLeft, that.topRight);
                if (thisTop != thatTop) {
                    return false;
                }
                int thisRight = computeDistance(this.topRight, this.bottomRight);
                int thatRight = computeDistance(that.topRight, that.bottomRight);
                if (thisRight != thatRight) {
                    return false;
                }
                int thisBottom = computeDistance(this.bottomRight, this.bottomLeft);
                int thatBottom = computeDistance(that.bottomRight, that.bottomLeft);
                if (thisBottom != thatBottom) {
                    return false;
                }
                int thisLeft = computeDistance(this.bottomLeft, this.topLeft);
                int thatLeft = computeDistance(that.bottomLeft, that.topLeft);
                return thisLeft == thatLeft;
            }

            private int computeDistance(int[] A, int[] B) {
                return (int) (Math.pow(A[0] - B[0], 2) + Math.pow(A[1] - B[1], 2));
            }

            @Override
            public int hashCode() {
                return area + computeDistance(this.topLeft, this.topRight) + computeDistance(this.topRight, this.bottomRight)
                        + computeDistance(this.bottomRight, this.bottomLeft) + computeDistance(this.bottomLeft, this.topLeft);
            }

            public void addPoint(int i, int j) {
                //todo: check wether this point (i,j) is in the range, if not, expand the range
                if (i == topRight[0]) {
                    topRight[1] = Math.max(topRight[1], j);
                }
                if (j == topRight[1]) {
                    topRight[0] = Math.min(topRight[1], i);
                }
                if (i == topLeft[0]) {
                    topLeft[1] = Math.min(topLeft[1], j);
                }
                if (j == topLeft[1]) {
                    topLeft[0] = Math.min(topLeft[0], i);
                }
                if (i == bottomLeft[0]) {
                    bottomLeft[1] = Math.min(bottomLeft[1], j);
                }
                if (j == bottomLeft[1]) {
                    bottomLeft[0] = Math.max(bottomLeft[0], i);
                }
                if (j == bottomRight[1]) {
                    bottomRight[0] = Math.max(bottomRight[0], i);
                }
                if (i == bottomRight[0]) {
                    bottomRight[1] = Math.max(bottomRight[1], j);
                }
            }

            public void addArea() {
                this.area++;
            }
        }

        public int numDistinctIslands(int[][] grid) {
            Set<Quadrilateral> set = new HashSet<>();
            int m = grid.length;
            int n = grid[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        Quadrilateral quadrilateral = dfs(grid, i, j, m, n, new Quadrilateral(i, j));
                        set.add(quadrilateral);
                    }
                }
            }
            return set.size();
        }

        private Quadrilateral dfs(int[][] grid, int i, int j, int m, int n, Quadrilateral quadrilateral) {
            if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) {
                return quadrilateral;
            }
            grid[i][j] = 0;
            quadrilateral.addPoint(i, j);
            quadrilateral.addArea();
            quadrilateral = dfs(grid, i + 1, j, m, n, quadrilateral);
            quadrilateral = dfs(grid, i - 1, j, m, n, quadrilateral);
            quadrilateral = dfs(grid, i, j + 1, m, n, quadrilateral);
            quadrilateral = dfs(grid, i, j - 1, m, n, quadrilateral);
            return quadrilateral;
        }
    }

    public static class Solution2 {
        int[][] directions = new int[][]{
                {0, 1},
                {1, 0},
                {0, -1},
                {-1, 0}
        };

        public int numDistinctIslands(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            Set<List<List<Integer>>> uniqueShapeIslands = new HashSet<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    List<List<Integer>> island = new ArrayList<>();
                    if (dfs(i, j, i, j, grid, m, n, island)) {
                        uniqueShapeIslands.add(island);
                    }
                }
            }
            return uniqueShapeIslands.size();
        }

        private boolean dfs(int i0, int j0, int i, int j, int[][] grid, int m, int n, List<List<Integer>> island) {
            if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] <= 0) {
                return false;
            }
            island.add(Arrays.asList(i - i0, j - j0));
            grid[i][j] *= -1;
            for (int k = 0; k < 4; k++) {
                dfs(i0, j0, i + directions[k][0], j + directions[k][1], grid, m, n, island);
            }
            return true;
        }
    }
}
