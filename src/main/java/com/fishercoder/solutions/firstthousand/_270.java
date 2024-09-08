package com.fishercoder.solutions.firstthousand;

import com.fishercoder.common.classes.TreeNode;

public class _270 {

    public static class Solution1 {
        public int closestValue(TreeNode root, double target) {
            int val;
            int closest = root.val;
            while (root != null) {
                val = root.val;
                closest =
                        Math.abs(val - target) < Math.abs(closest - target)
                                        || (Math.abs(val - target) == Math.abs(closest - target)
                                                && val < closest)
                                ? val
                                : closest;
                root = target < root.val ? root.left : root.right;
            }
            return closest;
        }
    }
}
