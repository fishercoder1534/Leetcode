package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _111 {
    public static class Solution1 {
        /**
         * DFS
         */
        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = minDepth(root.left);
            int right = minDepth(root.right);
            if (left == 0) {
                return right + 1;
            }
            if (right == 0) {
                return left + 1;
            }
            return Math.min(left, right) + 1;
        }
    }

    public static class Solution2 {
        /**
         * BFS
         */
        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            Queue<TreeNode> q = new LinkedList();
            q.offer(root);
            int level = 0;
            while (!q.isEmpty()) {
                level++;
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = q.poll();
                    if (curr.left != null) {
                        q.offer(curr.left);
                    }
                    if (curr.right != null) {
                        q.offer(curr.right);
                    }
                    if (curr.left == null && curr.right == null) {
                        return level;
                    }
                }
            }
            return level;
        }
    }
}
