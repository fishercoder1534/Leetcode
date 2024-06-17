package com.fishercoder.solutions.first_thousand;

import com.fishercoder.common.classes.TreeNode;

import java.util.*;

public class _863 {
    public static class Solution1 {
        /**
         * Since it's asking for distance k, a.k.a shortest distance, BFS should be the way to go.
         * For this particular problem: we'll do BFS twice:
         * 1st time: we build a child to parent mapping, in binary tree, there's only parent to children mapping, so we'll need to establish this child to parent link;
         * 2nd time: we push the target node into the queue, traverse all its neighbors (children and parent),
         * push them into the queue and decrement k by one, until k becomes zero, remaining elements in the queue are the answer.
         */
        public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
            Map<Integer, TreeNode> childToParentMap = new HashMap<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    if (curr.left != null) {
                        childToParentMap.put(curr.left.val, curr);
                        queue.offer(curr.left);
                    }
                    if (curr.right != null) {
                        childToParentMap.put(curr.right.val, curr);
                        queue.offer(curr.right);
                    }
                }
            }
            queue.offer(target);
            Set<Integer> visited = new HashSet<>();
            while (k > 0 && !queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    visited.add(curr.val);
                    if (curr.left != null && !visited.contains(curr.left.val)) {
                        queue.offer(curr.left);
                    }
                    if (curr.right != null && !visited.contains(curr.right.val)) {
                        queue.offer(curr.right);
                    }
                    if (childToParentMap.containsKey(curr.val) && !visited.contains(childToParentMap.get(curr.val).val)) {
                        queue.offer(childToParentMap.get(curr.val));
                    }
                }
                k--;
            }
            List<Integer> list = new ArrayList<>();
            while (!queue.isEmpty()) {
                list.add(queue.poll().val);
            }
            return list;
        }
    }
}
