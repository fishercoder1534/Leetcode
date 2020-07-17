package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _549 {

    public static class Solution1 {
        int max = 0;

        public int longestConsecutive(TreeNode root) {
            longestPath(root);
            return max;
        }

        private int[] longestPath(TreeNode root) {
            if (root == null) {
                return new int[]{0, 0};
            }
            int increasing = 1;
            int decreasing = 1;
            if (root.left != null) {
                int[] left = longestPath(root.left);
                if (root.val == root.left.val + 1) {
                    decreasing = left[1] + 1;
                } else if (root.val == root.left.val - 1) {
                    increasing = left[0] + 1;
                }
            }

            if (root.right != null) {
                int[] right = longestPath(root.right);
                if (root.val == root.right.val + 1) {
                    decreasing = Math.max(right[1] + 1, decreasing);
                } else if (root.val == root.right.val - 1) {
                    increasing = Math.max(right[0] + 1, increasing);
                }
            }

            max = Math.max(max, decreasing + increasing - 1);
            return new int[]{increasing, decreasing};
        }
    }
}
