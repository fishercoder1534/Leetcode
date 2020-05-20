package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _230 {

    public static class Solution1 {
        /**
         * Inorder traversal gives the natural ordering of a BST, no need to sort.
         */
        public int kthSmallest(TreeNode root, int k) {
            List<Integer> inorder = new ArrayList();
            dfs(root, inorder, k);
            return inorder.get(k - 1);
        }

        private void dfs(TreeNode root, List<Integer> list, int k) {
            if (root == null) {
                return;
            }
            dfs(root.left, list, k);
            list.add(root.val);
            dfs(root.right, list, k);
            if (list.size() >= (k - 1)) {
                return;
            }
        }
    }

}
