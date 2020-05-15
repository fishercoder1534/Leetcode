package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

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
