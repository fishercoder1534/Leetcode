package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _617 {

    public static class Solution1 {
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            if (t1 == null) {
                return t2;
            }
            if (t2 == null) {
                return t1;
            }
            TreeNode mergedNode = new TreeNode(t1.val + t2.val);
            mergedNode.left = mergeTrees(t1.left, t2.left);
            mergedNode.right = mergeTrees(t1.right, t2.right);
            return mergedNode;
        }
    }

}
