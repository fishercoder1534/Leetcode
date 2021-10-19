package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class _993 {
    public static class Solution1 {
        public boolean isCousins(TreeNode root, int x, int y) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode current = queue.poll();
                    if (current.left != null) {
                        queue.offer(current.left);
                    }
                    if (current.right != null) {
                        queue.offer(current.right);
                    }
                    if (current.left != null && current.right != null) {
                        if (current.left.val == x && current.right.val == y
                                || current.left.val == y && current.right.val == x) {
                            return false;
                        }
                    }
                }
                if (checkQueue(queue, x, y)) {
                    return true;
                }
            }
            return false;
        }

        private boolean checkQueue(Queue<TreeNode> queue, int x, int y) {
            Set<Integer> set = new HashSet<>();
            Queue<TreeNode> tmp = new LinkedList<>(queue);
            while (!tmp.isEmpty()) {
                set.add(tmp.poll().val);
            }
            return set.contains(x) && set.contains(y);
        }
    }

    public static class Solution2 {
        public boolean isCousins(TreeNode root, int x, int y) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            Map<Integer, Integer> childToParentMap = new HashMap<>();
            while (!queue.isEmpty()) {
                int size = queue.size();
                childToParentMap.clear();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    if (curr.left != null) {
                        queue.offer(curr.left);
                        childToParentMap.put(curr.left.val, curr.val);
                    }
                    if (curr.right != null) {
                        queue.offer(curr.right);
                        childToParentMap.put(curr.right.val, curr.val);
                    }
                }
                if (childToParentMap.containsKey(x) && childToParentMap.containsKey(y) && childToParentMap.get(x) != childToParentMap.get(y)) {
                    return true;
                } else if (childToParentMap.containsKey(x) || childToParentMap.containsKey(y)) {
                    return false;
                }
            }
            return false;
        }
    }
}
