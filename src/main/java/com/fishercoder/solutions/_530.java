package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.Iterator;
import java.util.TreeSet;

public class _530 {

    public static class Solution1 {
        public int getMinimumDifference(TreeNode root) {
            TreeSet<Integer> treeset = new TreeSet<>();
            treeset.add(root.val);
            dfs(root, treeset);
            int diff = Integer.MAX_VALUE;
            Iterator<Integer> iterator = treeset.iterator();
            int prev = iterator.next();
            while (iterator.hasNext()) {
                int current = iterator.next();
                diff = Math.min(diff, Math.abs(current - prev));
                prev = current;
            }
            return diff;
        }

        private void dfs(TreeNode root, TreeSet<Integer> treeset) {
            if (root.left != null) {
                treeset.add(root.left.val);
                dfs(root.left, treeset);
            }
            if (root.right != null) {
                treeset.add(root.right.val);
                dfs(root.right, treeset);
            }
        }
    }
}
