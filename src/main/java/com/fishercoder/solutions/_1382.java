package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _1382 {
    public static class Solution1 {
        public TreeNode balanceBST(TreeNode root) {
            List<Integer> inorder = inorder(root, new ArrayList<>());
            return dfs(inorder, 0, inorder.size() - 1);
        }

        private List<Integer> inorder(TreeNode root, List<Integer> list) {
            if (root == null) {
                return list;
            }
            inorder(root.left, list);
            list.add(root.val);
            return inorder(root.right, list);
        }

        private TreeNode dfs(List<Integer> nums, int start, int end) {
            if (end < start) {
                return null;
            }
            int mid = (start + end) / 2;
            TreeNode root = new TreeNode(nums.get(mid));
            root.left = dfs(nums, start, mid - 1);
            root.right = dfs(nums, mid + 1, end);
            return root;
        }
    }
}
