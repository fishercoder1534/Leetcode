package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _103 {
    public static class Solution1 {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList();
            List<List<Integer>> levels = new ArrayList();
            if (root == null) {
                return levels;
            }
            queue.offer(root);
            boolean forward = true;
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> level = new ArrayList();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    level.add(curr.val);
                    if (curr.left != null) {
                        queue.offer(curr.left);
                    }
                    if (curr.right != null) {
                        queue.offer(curr.right);
                    }
                }
                if (!forward) {
                    Collections.reverse(level);
                }
                forward = !forward;
                levels.add(level);
            }
            return levels;
        }
    }
}
