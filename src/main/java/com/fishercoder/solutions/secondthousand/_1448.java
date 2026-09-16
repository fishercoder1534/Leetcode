package com.fishercoder.solutions.secondthousand;

import com.fishercoder.common.classes.TreeNode;

public class _1448 {
    public static class Solution1 {

        public int goodNodes(TreeNode root) {
            return dfs(root, root.val);
        }

        private int dfs(TreeNode root, int maxSofar) {
            if (root == null) {
                return 0;
            }

            int count = 0;
            if (root.val >= maxSofar) {
                count++;
                maxSofar = root.val;
            }
            count += dfs(root.left, maxSofar);
            count += dfs(root.right, maxSofar);
            return count;
        }
    }
}
