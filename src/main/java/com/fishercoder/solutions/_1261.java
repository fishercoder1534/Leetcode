package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _1261 {
    public static class Solution1 {
        class FindElements {

            TreeNode recoveredRoot;

            public FindElements(TreeNode root) {
                recoveredRoot = new TreeNode(0);
                recoveredRoot = recoverTree(root, recoveredRoot);
            }

            private TreeNode recoverTree(TreeNode root, TreeNode recoveredRoot) {
                if (root == null) {
                    return recoveredRoot;
                }
                if (root.left != null) {
                    recoveredRoot.left = new TreeNode(recoveredRoot.val * 2 + 1);
                }
                if (root.right != null) {
                    recoveredRoot.right = new TreeNode(recoveredRoot.val * 2 + 2);
                }
                recoverTree(root.left, recoveredRoot.left);
                recoverTree(root.right, recoveredRoot.right);
                return recoveredRoot;
            }

            public boolean find(int target) {
                return find(recoveredRoot, target);
            }

            private boolean find(TreeNode root, int target) {
                if (root == null) {
                    return false;
                } else if (root.val == target) {
                    return true;
                }
                return find(root.left, target) || find(root.right, target);
            }
        }
    }
}
