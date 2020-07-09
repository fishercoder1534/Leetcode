package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class _662 {
    public static class Solution1 {
        /**
         * Use a map to store the node to value map,
         * we use root as index 1, then its left child is 2*i-1 and right child is 2*i
         */
        public int widthOfBinaryTree(TreeNode root) {
            if (root == null) {
                return 0;
            }

            Queue<Map.Entry<TreeNode, Integer>> queue = new LinkedList<>();
            queue.offer(new AbstractMap.SimpleEntry<>(root, 1));
            int max = 1;
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Map.Entry<TreeNode, Integer>> list = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    Map.Entry<TreeNode, Integer> curr = queue.poll();
                    if (curr.getKey().left != null) {
                        Map.Entry<TreeNode, Integer> newEntry = new AbstractMap.SimpleEntry<>(curr.getKey().left, curr.getValue() * 2 - 1);
                        queue.offer(newEntry);
                        list.add(newEntry);
                    }
                    if (curr.getKey().right != null) {
                        Map.Entry<TreeNode, Integer> newEntry = new AbstractMap.SimpleEntry<>(curr.getKey().right, curr.getValue() * 2);
                        queue.offer(newEntry);
                        list.add(newEntry);
                    }
                }
                if (list.size() > 1) {
                    max = Math.max(list.get(list.size() - 1).getValue() - list.get(0).getValue() + 1, max);
                }
            }
            return max;
        }
    }
}
