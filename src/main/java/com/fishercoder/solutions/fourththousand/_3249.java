package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _3249 {
    public static class Solution1 {
        /*
         * My completely original solution during the contest.
         */
        class TreeNode {
            int val;
            List<TreeNode> children;
            int totalChildrenCount;

            public TreeNode(int val) {
                this.val = val;
                this.children = new ArrayList<>();
                this.totalChildrenCount = 1; // count itself as its own child
            }
        }

        int goodNodes = 0;

        public int countGoodNodes(int[][] edges) {
            if (edges == null || edges.length == 0 || edges[0].length == 0) {
                return 0;
            }
            TreeNode root = buildTree(edges);
            postOrder(root);
            dfs(root);
            return goodNodes;
        }

        private void dfs(TreeNode root) {
            if (root == null || root.children.isEmpty()) {
                return;
            }
            int size = root.children.get(0).totalChildrenCount;
            if (size == 0) {
                return;
            }
            boolean possiblyGoodNode = true;
            for (TreeNode child : root.children) {
                if (child.totalChildrenCount != size) {
                    possiblyGoodNode = false;
                    break;
                }
            }
            if (possiblyGoodNode) {
                goodNodes++;
            }
            for (TreeNode child : root.children) {
                dfs(child);
            }
        }

        private int postOrder(TreeNode root) {
            if (root == null) {
                return 0;
            }
            if (root.children.isEmpty()) {
                goodNodes++;
                return 1;
            }
            int totalChildrenCount = 1;
            for (TreeNode child : root.children) {
                int count = postOrder(child);
                totalChildrenCount += count;
            }
            root.totalChildrenCount = totalChildrenCount;
            return totalChildrenCount;
        }

        private TreeNode buildTree(int[][] edges) {
            Map<Integer, TreeNode> map = new HashMap<>();
            for (int i = 0; i < edges.length; i++) {
                if (edges[i][0] == 0 || edges[i][1] == 0) {
                    if (edges[i][0] == 0) {
                        TreeNode parent = map.getOrDefault(edges[i][0], new TreeNode(edges[i][0]));
                        TreeNode child = map.getOrDefault(edges[i][1], new TreeNode(edges[i][1]));
                        parent.children.add(child);
                        map.put(edges[i][0], parent);
                        map.put(edges[i][1], child);
                    } else {
                        TreeNode parent = map.getOrDefault(edges[i][1], new TreeNode(edges[i][1]));
                        TreeNode child = map.getOrDefault(edges[i][0], new TreeNode(edges[i][0]));
                        parent.children.add(child);
                        map.put(edges[i][1], parent);
                        map.put(edges[i][0], child);
                    }
                } else {
                    if (map.containsKey(edges[i][0])) {
                        TreeNode parent = map.get(edges[i][0]);
                        TreeNode child = map.getOrDefault(edges[i][1], new TreeNode(edges[i][1]));
                        parent.children.add(child);
                        map.put(edges[i][0], parent);
                        map.put(edges[i][1], child);
                    } else if (map.containsKey(edges[i][1])) {
                        TreeNode parent = map.get(edges[i][1]);
                        TreeNode child = map.getOrDefault(edges[i][0], new TreeNode(edges[i][0]));
                        parent.children.add(child);
                        map.put(edges[i][1], parent);
                        map.put(edges[i][0], child);
                    }
                }
            }
            return map.get(0);
        }
    }
}
