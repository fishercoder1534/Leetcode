package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _1469 {
    public static class Solution1 {
        public List<Integer> getLonelyNodes(TreeNode root) {
            List<Integer> lonelyNodes = new ArrayList<>();
            dfs(root, lonelyNodes);
            return lonelyNodes;
        }

        private void dfs(TreeNode root, List<Integer> lonelyNodes) {
            if (root == null) {
                return;
            }

            if (root.left == null && root.right != null) {
                lonelyNodes.add(root.right.val);
            }

            if (root.left != null && root.right == null) {
                lonelyNodes.add(root.left.val);
            }

            dfs(root.left, lonelyNodes);
            dfs(root.right, lonelyNodes);
        }
    }
}
