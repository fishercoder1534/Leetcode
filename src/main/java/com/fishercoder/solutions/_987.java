package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class _987 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/discuss/231148/Java-TreeMap-Solution
         */
        public List<List<Integer>> verticalTraversal(TreeNode root) {
            TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
            dfs(root, 0, 0, map);
            List<List<Integer>> list = new ArrayList<>();
            for (TreeMap<Integer, PriorityQueue<Integer>> yMap : map.values()) {
                list.add(new ArrayList<>());
                for (PriorityQueue<Integer> nodes : yMap.values()) {
                    while (!nodes.isEmpty()) {
                        list.get(list.size() - 1).add(nodes.poll());
                    }
                }
            }
            return list;
        }

        private void dfs(TreeNode root, int x, int y, TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map) {
            if (root == null) {
                return;
            }
            if (!map.containsKey(x)) {
                map.put(x, new TreeMap<>());
            }
            if (!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue<>());
            }
            map.get(x).get(y).offer(root.val);
            dfs(root.left, x - 1, y + 1, map);
            dfs(root.right, x + 1, y + 1, map);
        }
    }
}
