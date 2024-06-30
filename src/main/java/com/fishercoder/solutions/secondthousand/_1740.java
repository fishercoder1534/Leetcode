package com.fishercoder.solutions.secondthousand;

import com.fishercoder.common.classes.TreeNode;

import java.util.*;

public class _1740 {
    public static class Solution1 {
        /**
         * My completely original solution on 6/30/2024.
         */
        public int findDistance(TreeNode root, int p, int q) {
            //dfs to find either p or q first, then add it into a queue, also form a child to parent mapping
            Queue<TreeNode> queue = new LinkedList<>();
            Map<TreeNode, TreeNode> childToParent = new HashMap<>();
            dfs(root, p, q, queue, childToParent);
            int target = queue.peek().val == p ? q : p;
            int distance = 0;
            Set<Integer> visited = new HashSet<>();//this visited collection is often very essential to prevent infinite loop.
            visited.add(queue.peek().val);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    if (curr == null) {
                        continue;
                    }
                    if (curr.val == target) {
                        return distance;
                    }
                    if (curr.left != null && visited.add(curr.left.val)) {
                        queue.offer(curr.left);
                    }
                    if (curr.right != null && visited.add(curr.right.val)) {
                        queue.offer(curr.right);
                    }
                    if (childToParent.containsKey(curr) && visited.add(childToParent.get(curr).val)) {
                        queue.offer(childToParent.get(curr));
                    }
                }
                distance++;
            }
            return distance;
        }

        private void dfs(TreeNode root, int p, int q, Queue<TreeNode> queue, Map<TreeNode, TreeNode> childToParent) {
            if (root == null) {
                return;
            }
            if (root.val == p || root.val == q) {
                if (queue.isEmpty()) {
                    queue.offer(root);
                }
            }

            if (root.left != null) {
                childToParent.put(root.left, root);
            }
            dfs(root.left, p, q, queue, childToParent);

            if (root.right != null) {
                childToParent.put(root.right, root);
            }

            dfs(root.right, p, q, queue, childToParent);
        }
    }
}
