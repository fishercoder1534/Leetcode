package com.fishercoder.solutions.secondthousand;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _1602 {
    public static class Solution1 {
        public TreeNode findNearestRightNode(TreeNode root, TreeNode u) {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = q.poll();
                    if (curr == u) {
                        if (i == size - 1) {
                            return null;
                        } else {
                            return q.poll();
                        }
                    }
                    if (curr.left != null) {
                        q.offer(curr.left);
                    }
                    if (curr.right != null) {
                        q.offer(curr.right);
                    }
                }
            }
            return null;
        }
    }
}
