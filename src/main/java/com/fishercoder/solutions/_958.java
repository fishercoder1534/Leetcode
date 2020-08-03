package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _958 {
    public static class Solution1 {
        public boolean isCompleteTree(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            boolean shouldHaveNoMoreChildren = false;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    if (shouldHaveNoMoreChildren && (curr.left != null || curr.right != null)) {
                        return false;
                    }
                    if (curr.left == null && curr.right != null) {
                        return false;
                    }
                    if (curr.left != null) {
                        queue.offer(curr.left);
                    }
                    if (curr.right == null) {
                        shouldHaveNoMoreChildren = true;
                    } else {
                        queue.offer(curr.right);
                    }
                }
            }
            return true;
        }
    }
}
