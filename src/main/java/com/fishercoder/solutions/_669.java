package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _669 {
    public static class Solution1 {
        public TreeNode trimBST(TreeNode root, int L, int R) {
            if (root == null) {
                return root;
            }

            if (root.val > R) {
                return trimBST(root.left, L, R);
            }

            if (root.val < L) {
                return trimBST(root.right, L, R);
            }

            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
            return root;
        }
    }
}
