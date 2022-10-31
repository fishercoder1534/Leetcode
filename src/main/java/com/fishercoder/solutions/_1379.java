package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _1379 {
    public static class Solution1 {
        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            if (original == null) {
                return null;
            }
            if (original.val == target.val) {
                return cloned;
            }
            TreeNode left = getTargetCopy(original.left, cloned.left, target);
            if (left != null && left.val == target.val) {
                return left;
            }
            return getTargetCopy(original.right, cloned.right, target);
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 5/17/2022.
         */
        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            if (original == null || cloned == null) {
                return null;
            }
            if (original == target) {
                return cloned;
            }
            TreeNode left = getTargetCopy(original.left, cloned.left, target);
            if (left == null) {
                return getTargetCopy(original.right, cloned.right, target);
            }
            return left;
        }
    }
}
