package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class _3157 {
    public static class Solution1 {
        public int minimumLevel(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            TreeMap<Long, Integer> treeMap = new TreeMap<>();
            int level = 1;
            while (!q.isEmpty()) {
                int size = q.size();
                long sum = 0L;
                for (int i = 0; i < size; i++) {
                    TreeNode curr = q.poll();
                    sum += curr.val;
                    if (curr.left != null) {
                        q.offer(curr.left);
                    }
                    if (curr.right != null) {
                        q.offer(curr.right);
                    }
                }
                if (!treeMap.containsKey(sum)) {
                    treeMap.put(sum, level);
                }
                level++;
            }
            return treeMap.firstEntry().getValue();
        }
    }
}
