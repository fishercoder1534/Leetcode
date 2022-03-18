package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _108 {

    public static class Solution1 {
        public TreeNode sortedArrayToBST(int[] num) {
            return dfs(num, 0, num.length - 1);
        }

        public TreeNode dfs(int[] num, int left, int right) {
            if (left > right) {
                return null;
            }
            int mid = left + (right - left) / 2;
            TreeNode node = new TreeNode(num[mid]);
            node.left = dfs(num, left, mid - 1);
            node.right = dfs(num, mid + 1, right);
            return node;
        }
    }
}
