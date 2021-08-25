package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _938 {
    public static class Solution1 {
        public int rangeSumBST(TreeNode root, int low, int high) {
            if (root == null) {
                return 0;
            }
            List<Integer> list = new ArrayList<>();
            dfs(root, low, high, list);
            return list.stream().mapToInt(num -> num).sum();
        }

        private void dfs(TreeNode root, int l, int r, List<Integer> list) {
            if (root == null) {
                return;
            }
            if (root.val <= r && root.val >= l) {
                list.add(root.val);
            }
            dfs(root.left, l, r, list);
            dfs(root.right, l, r, list);
        }
    }
}
