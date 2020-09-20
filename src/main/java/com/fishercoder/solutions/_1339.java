package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class _1339 {
    public static class Solution1 {
        public int maxProduct(TreeNode root) {
            Set<Long> set = new HashSet<>();
            int total = dfs(root, set);
            long result = 0L;
            for (long sum : set) {
                result = Math.max(result, sum * (total - sum));
            }
            return (int) (result % 1000000007);
        }

        private int dfs(TreeNode root, Set<Long> set) {
            if (root == null) {
                return 0;
            }
            root.val += dfs(root.left, set);
            root.val += dfs(root.right, set);
            set.add((long) root.val);
            return root.val;
        }
    }
}
