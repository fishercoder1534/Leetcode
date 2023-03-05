package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.*;

public class _2583 {
    public static class Solution1 {
        public long kthLargestLevelSum(TreeNode root, int k) {
            List<Long> list = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                long thisSum = 0l;
                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    thisSum += curr.val;
                    if (curr.left != null) {
                        queue.offer(curr.left);
                    }
                    if (curr.right != null) {
                        queue.offer(curr.right);
                    }
                }
                list.add(thisSum);
            }
            Collections.sort(list, Collections.reverseOrder());
            return k > list.size() ? -1 : list.get(k - 1);
        }
    }
}
