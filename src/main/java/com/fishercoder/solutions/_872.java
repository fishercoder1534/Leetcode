package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _872 {
    public static class Solution1 {
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> leaves1 = new ArrayList<>();
            List<Integer> leaves2 = new ArrayList<>();
            preorder(root1, leaves1);
            preorder(root2, leaves2);
            return leaves1.equals(leaves2);
        }

        private void preorder(TreeNode root,
                              List<Integer> leaves) {
            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                leaves.add(root.val);
            }
            preorder(root.left, leaves);
            preorder(root.right, leaves);
        }
    }
}
