package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public static class Solution2 {
        public boolean findTarget(TreeNode root, int k) {
            return dfs(root, new HashSet(), k);
        }

        private boolean dfs(TreeNode root, Set<Integer> set, int k) {
            if (root == null) {
                return false;
            }

            if (set.contains(k - root.val)) {
                return true;
            }
            set.add(root.val);
            return dfs(root.left, set, k) || dfs(root.right, set, k);
        }
    }
}
