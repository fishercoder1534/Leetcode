package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.Collections;
import java.util.PriorityQueue;

public class _1448 {
    public static class Solution1 {
        int count;

        public int goodNodes(TreeNode root) {
            dfs(root, new PriorityQueue<>(Collections.reverseOrder()));
            return count;
        }

        private void dfs(TreeNode root, PriorityQueue<Integer> maxHeap) {
            if (root == null) {
                return;
            }
            maxHeap.offer(root.val);
            if (root.val >= maxHeap.peek()) {
                count++;
            }
            if (root.left != null) {
                dfs(root.left, maxHeap);
            }
            if (root.right != null) {
                dfs(root.right, maxHeap);
            }
            maxHeap.remove(root.val);
        }
    }
}
