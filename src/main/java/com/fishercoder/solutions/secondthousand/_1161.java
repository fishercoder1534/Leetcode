package com.fishercoder.solutions.secondthousand;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _1161 {
    public static class Solution1 {
        public int maxLevelSum(TreeNode root) {
            int maxSum = Integer.MIN_VALUE;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int ans = 1;
            int level = 1;
            while (!queue.isEmpty()) {
                int levelSum = 0;
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    levelSum += node.val;
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
                if (levelSum > maxSum) {
                    maxSum = levelSum;
                    ans = level;
                }
                level++;
            }
            return ans;
        }
    }
}
