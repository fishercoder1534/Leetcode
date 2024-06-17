package com.fishercoder.solutions._1st_thousand;

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

        private void dfs(TreeNode root, int low, int high, List<Integer> list) {
            if (root == null) {
                return;
            }
            if (root.val <= high && root.val >= low) {
                list.add(root.val);
            }
            if (root.val > low) {
                dfs(root.left, low, high, list);
            }
            if (root.val < high) {
                dfs(root.right, low, high, list);
            }
        }
    }
}
