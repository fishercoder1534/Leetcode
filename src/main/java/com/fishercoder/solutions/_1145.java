package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _1145 {
    public static class Solution1 {
        public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
            if (root == null) {
                return false;
            }

            if (root.val == x) {
                // 3 possible paths to block, left, right, parent
                int leftCount = countNodes(root.left);
                int rightCount = countNodes(root.right);
                int parent = n - (leftCount + rightCount + 1);

                // possible to win if no. of nodes in 1 path is > than sum of nodes in the other 2 paths
                return parent > (leftCount + rightCount) || leftCount > (parent + rightCount) || rightCount > (parent + leftCount);
            }
            return btreeGameWinningMove(root.left, n, x) || btreeGameWinningMove(root.right, n, x);
        }

        private int countNodes(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }
}
