package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**
 * 222. Count Complete Tree Nodes
 *
 * Given a complete binary tree, count the number of nodes.
 * Definition of a complete binary tree from Wikipedia:
 * In a complete binary tree every level,
 * except possibly the last, is completely filled,
 * and all nodes in the last level are as far left as possible.
 * It can have between 1 and 2h nodes inclusive at the last level h.
 */
public class _222 {

    public static class Solution1 {
        /**
         * reference: https://discuss.leetcode.com/topic/21317/accepted-easy-understand-java-solution/2
         */
        public int countNodes(TreeNode root) {
            int leftH = getLeftHeight(root);
            int rightH = getRightHeight(root);
            if (leftH == rightH) {
                return (1 << leftH) - 1;
            } else {
                return 1 + countNodes(root.left) + countNodes(root.right);
            }
        }

        private int getRightHeight(TreeNode root) {
            int height = 0;
            while (root != null) {
                root = root.right;
                height++;
            }
            return height;
        }

        private int getLeftHeight(TreeNode root) {
            int height = 0;
            while (root != null) {
                root = root.left;
                height++;
            }
            return height;
        }
    }

}
