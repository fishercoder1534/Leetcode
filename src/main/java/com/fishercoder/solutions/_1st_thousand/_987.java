package com.fishercoder.solutions._1st_thousand;

import com.fishercoder.common.classes.TreeNode;

import java.util.*;

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

    public static class Solution2 {

        /**
         * My completely original solution on 6/13/2024.
         */
        public List<List<Integer>> verticalTraversal(TreeNode root) {
            TreeMap<Integer, List<NodeWithCoords>> map = new TreeMap<>();
            Queue<NodeWithCoords> q = new LinkedList<>();
            q.offer(new NodeWithCoords(root, 0, 0));
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    NodeWithCoords curr = q.poll();
                    int col = curr.col;
                    int row = curr.row;
                    List<NodeWithCoords> list = map.getOrDefault(col, new ArrayList<>());
                    list.add(curr);
                    map.put(col, list);
                    if (curr.node.left != null) {
                        q.offer(new NodeWithCoords(curr.node.left, row + 1, col - 1));
                    }
                    if (curr.node.right != null) {
                        q.offer(new NodeWithCoords(curr.node.right, row + 1, col + 1));
                    }
                }
            }
            List<List<Integer>> result = new ArrayList<>();
            for (Integer key : map.keySet()) {
                List<NodeWithCoords> list = map.get(key);
                Collections.sort(list, (a, b) -> {
                    if (a.row != b.row) {
                        return a.row - b.row;
                    } else if (a.col != b.col) {
                        return a.col - b.col;
                    } else {
                        return a.node.val - b.node.val;
                    }
                });
                List<Integer> intList = new ArrayList<>();
                for (NodeWithCoords nodeWithCoords : list) {
                    intList.add(nodeWithCoords.node.val);
                }
                result.add(intList);
            }
            return result;
        }

        class NodeWithCoords {
            TreeNode node;
            int row;
            int col;

            public NodeWithCoords(TreeNode node, int row, int col) {
                this.node = node;
                this.row = row;
                this.col = col;
            }
        }
    }
}
