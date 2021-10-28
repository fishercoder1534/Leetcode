package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class _671 {
    public static class Solution1 {
        public int findSecondMinimumValue(TreeNode root) {
            TreeSet<Integer> set = new TreeSet<>();
            dfs(root, set);
            if (set.size() < 2) {
                return -1;
            }
            set.pollFirst();
            return set.pollFirst();
        }

        private void dfs(TreeNode root, TreeSet<Integer> set) {
            if (root == null) {
                return;
            }
            set.add(root.val);
            dfs(root.left, set);
            dfs(root.right, set);
        }

    }
}
