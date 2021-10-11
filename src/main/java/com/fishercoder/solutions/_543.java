package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _543 {

    public static class Solution1 {
        /**
         * A great observation of this problem is that the longest path must exist between two leaf nodes,
         * since it's easy to prove its opposite is not the longest by simply adding one to reach its leaf node.
         *
         * <p>
         * This is a very great problem for practicing recursion:
         * 1. What dfs() returns is the max height it should pick from either its left or right subtree, that's
         * what the int return type stands for;
         * 2. And during the recursion, we can keep updating the global variable: "diameter";
         * 3. When computing length/height of a subtree, we should take the max of its left and right, then plus one
         * and left height should be like this
         * int left = dfs(root.left);
         * instead of dfs(root.left) + 1;
         * we'll only plus one at the end
         */
        int diameter = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            dfs(root);
            return diameter;
        }

        private int dfs(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int leftPath = dfs(root.left);
            int rightPath = dfs(root.right);
            diameter = Math.max(diameter, leftPath + rightPath);
            return Math.max(leftPath, rightPath) + 1;
        }
    }
}
