package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _563 {
    public static class Solution1 {

        int tilt = 0;

        public int findTilt(TreeNode root) {
            findTiltDfs(root);
            return tilt;
        }

        public int findTiltDfs(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int leftTilt = 0;
            if (root.left != null) {
                leftTilt = findTiltDfs(root.left);
            }
            int rightTilt = 0;
            if (root.right != null) {
                rightTilt = findTiltDfs(root.right);
            }
            if (root.left == null && root.right == null) {
                return root.val;
            }
            tilt += Math.abs(leftTilt - rightTilt);
            return leftTilt + rightTilt + root.val;
        }
    }

}
