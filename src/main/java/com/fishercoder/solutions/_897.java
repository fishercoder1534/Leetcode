package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _897 {
    public static class Solution1 {
        public TreeNode increasingBST(TreeNode root) {
            List<Integer> inorderList = new ArrayList<>();
            inorderTraversal(root, inorderList);
            return constructTree(inorderList);
        }

        private TreeNode constructTree(List<Integer> inorderList) {
            if (inorderList.isEmpty() || inorderList.size() == 0) {
                return null;
            }
            TreeNode root = new TreeNode(inorderList.get(0));
            TreeNode tmp = root;
            for (int i = 1; i < inorderList.size(); i++) {
                tmp.right = new TreeNode(inorderList.get(i));
                tmp = tmp.right;
            }
            return root;
        }

        private void inorderTraversal(TreeNode root, List<Integer> inorderList) {
            if (root == null) {
                return;
            }
            if (root.left != null) {
                inorderTraversal(root.left, inorderList);
            }
            inorderList.add(root.val);
            if (root.right != null) {
                inorderTraversal(root.right, inorderList);
            }
        }
    }
}
