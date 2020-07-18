package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _653 {

    public static class Solution1 {
        public boolean findTarget(TreeNode root, int k) {
            if (root == null) {
                return false;
            }
            List<Integer> list = new ArrayList<>();
            dfs(root, list);
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i) + list.get(j) == k) {
                        return true;
                    }
                }
            }
            return false;
        }

        private void dfs(TreeNode root, List<Integer> list) {
            list.add(root.val);
            if (root.left != null) {
                dfs(root.left, list);
            }
            if (root.right != null) {
                dfs(root.right, list);
            }
        }
    }
}
