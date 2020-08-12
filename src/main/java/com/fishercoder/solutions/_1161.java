package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class _1161 {
    public static class Solution1 {
        public int maxLevelSum(TreeNode root) {
            if (root == null) {
                return 0;
            }
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            TreeMap<Integer, Integer> treeMap = new TreeMap<>((a, b) -> b - a);
            int level = 1;
            while (!q.isEmpty()) {
                int size = q.size();
                int sum = 0;
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
                treeMap.put(sum, level);
                level++;
            }
            return treeMap.firstEntry().getValue();
        }
    }
}
