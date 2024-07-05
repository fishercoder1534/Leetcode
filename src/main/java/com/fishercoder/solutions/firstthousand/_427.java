package com.fishercoder.solutions.firstthousand;

public class _427 {
    static class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }

    public static class Solution1 {
        public Node construct(int[][] grid) {
            return recurse(grid, 0, 0, grid.length);
        }

        private Node recurse(int[][] grid, int row, int col, int limit) {
            if (allTheSameValue(grid, row, col, limit)) {
                return new Node(grid[row][col] == 1, true);
            } else {
                Node root = new Node(false, false);
                //top left
                root.topLeft = recurse(grid, row, col, limit / 2);
                //top right
                root.topRight = recurse(grid, row, col + limit / 2, limit / 2);
                //bottom left
                root.bottomLeft = recurse(grid, row + limit / 2, col, limit / 2);
                //bottom right
                root.bottomRight = recurse(grid, row + limit / 2, col + limit / 2, limit / 2);
                return root;
            }
        }

        private boolean allTheSameValue(int[][] grid, int row, int col, int limit) {
            int val = grid[row][col];
            for (int i = row; i < row + limit; i++) {
                for (int j = col; j < col + limit; j++) {
                    if (val != grid[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static class Solution2 {
        public Node construct(int[][] grid) {
            return recurse(grid, 0, 0, grid.length);
        }

        private Node recurse(int[][] grid, int row, int col, int limit) {
            if (limit == 1) {
                return new Node(grid[row][col] == 1, true);
            }
            Node topLeft = recurse(grid, row, col, limit / 2);
            Node topRgith = recurse(grid, row, col + limit / 2, limit / 2);
            Node bottomLeft = recurse(grid, row + limit / 2, col, limit / 2);
            Node bottomRight = recurse(grid, row + limit / 2, col + limit / 2, limit / 2);
            if (topLeft.isLeaf && topRgith.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf && topLeft.val == topRgith.val && topLeft.val == bottomLeft.val && topLeft.val == bottomRight.val) {
                return new Node(topLeft.val, true);
            }
            Node root = new Node(grid[row][col] == 1, false);
            root.topLeft = topLeft;
            root.topRight = topRgith;
            root.bottomLeft = bottomLeft;
            root.bottomRight = bottomRight;
            return root;
        }
    }
}
