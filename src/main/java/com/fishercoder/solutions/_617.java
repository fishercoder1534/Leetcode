package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _617 {

    public static class Solution1 {
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            if (root1 == null) {
                return root2;
            }
            if (root2 == null) {
                return root1;
            }
            TreeNode mergedNode = new TreeNode(root1.val + root2.val);
            mergedNode.left = mergeTrees(root1.left, root2.left);
            mergedNode.right = mergeTrees(root1.right, root2.right);
            return mergedNode;
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 9/20/2021, no new extra nodes created.
         */
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            if (root1 == null) {
                return root2;
            } else if (root2 == null) {
                return root1;
            }
            root1.val += root2.val;
            root1.left = mergeTrees(root1.left, root2.left);
            root1.right = mergeTrees(root1.right, root2.right);
            return root1;
        }
    }

}
