package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _783 {
    public static class Solution1 {
        public int minDiffInBST(TreeNode root) {
            List<Integer> inorder = new ArrayList<>();
            inorder(root, inorder);
            return findMinDiff(inorder);
        }

        private int findMinDiff(List<Integer> inorder) {
            int minDiff = Integer.MAX_VALUE;
            for (int i = 1; i < inorder.size(); i++) {
                minDiff = Math.min(minDiff, inorder.get(i) - inorder.get(i - 1));
            }
            return minDiff;
        }

        private void inorder(TreeNode root, List<Integer> inorder) {
            if (root == null) {
                return;
            }
            inorder(root.left, inorder);
            inorder.add(root.val);
            inorder(root.right, inorder);
        }
    }
}
