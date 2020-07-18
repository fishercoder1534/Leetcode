package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class _671 {
    public static class Solution1 {
        public int findSecondMinimumValue(TreeNode root) {
            if (root == null) {
                return -1;
            }
            Set<Integer> set = new TreeSet<>();
            dfs(root, set);
            Iterator<Integer> iterator = set.iterator();
            int count = 0;
            while (iterator.hasNext()) {
                count++;
                int result = iterator.next();
                if (count == 2) {
                    return result;
                }
            }
            return -1;
        }

        private void dfs(TreeNode root, Set<Integer> set) {
            if (root == null) {
                return;
            }
            set.add(root.val);
            dfs(root.left, set);
            dfs(root.right, set);
            return;
        }
    }
}
