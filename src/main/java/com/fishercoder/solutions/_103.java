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
            Queue<TreeNode> q = new LinkedList();
            List<List<Integer>> levels = new ArrayList();
            if (root == null) {
                return levels;
            }
            q.offer(root);
            boolean forward = true;
            while (!q.isEmpty()) {
                int size = q.size();
                List<Integer> level = new ArrayList();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = q.poll();
                    level.add(curr.val);
                    if (curr.left != null) {
                        q.offer(curr.left);
                    }
                    if (curr.right != null) {
                        q.offer(curr.right);
                    }
                }
                if (forward) {
                    forward = false;
                    levels.add(level);
                } else {
                    Collections.reverse(level);
                    levels.add(level);
                    forward = true;
                }
            }
            return levels;
        }
    }
}
