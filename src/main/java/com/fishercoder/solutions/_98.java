package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _98 {

    public static class Solution1 {

        public boolean isValidBST(TreeNode root) {
            return valid(root, null, null);
        }

        boolean valid(TreeNode root, Integer min, Integer max) {
            if (root == null) {
                return true;
            }
            if ((min != null && root.val <= min) || (max != null && root.val >= max)) {
                return false;
            }
            return valid(root.left, min, root.val) && valid(root.right, root.val, max);
        }
    }

}
