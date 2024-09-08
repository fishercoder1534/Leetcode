package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _3004 {
    public static class Solution1 {
        /*
         * My completely original solution.
         * Practice makes perfect!
         * Post-order traversal is the way to go since we need to process all children first before processing any particular node.
         */
        class ColoredTreeNode {
            int val;
            int color;
            List<ColoredTreeNode> children;
            boolean allSubtreeSameColor;
            int totalChildrenCount;

            public ColoredTreeNode(int val, int color) {
                this.val = val;
                this.color = color;
                this.children = new ArrayList<>();
                this.allSubtreeSameColor =
                        true; // initialize to be true until it's built/proven to be false
                this.totalChildrenCount = 1; // count itself as its own child
            }
        }

        int maxSize = 0;

        public int maximumSubtreeSize(int[][] edges, int[] colors) {
            if (edges == null || edges.length == 0 || edges[0].length == 0) {
                return colors.length > 0 ? 1 : 0;
            }
            ColoredTreeNode root = buildTree(edges, colors);
            int totalNodeCount = postOrder(root);
            if (root.allSubtreeSameColor) {
                return totalNodeCount;
            }
            return maxSize;
        }

        private int postOrder(ColoredTreeNode root) {
            if (root == null) {
                return 0;
            }
            int totalChildrenCount = 1; // count itself as a child
            for (ColoredTreeNode child : root.children) {
                int count = postOrder(child);
                totalChildrenCount += count;
                if (root.color != child.color || !child.allSubtreeSameColor) {
                    root.allSubtreeSameColor = false;
                }
            }
            root.totalChildrenCount = totalChildrenCount;
            if (root.allSubtreeSameColor) {
                maxSize = Math.max(maxSize, root.totalChildrenCount);
            }
            return totalChildrenCount;
        }

        private ColoredTreeNode buildTree(int[][] edges, int[] colors) {
            Map<Integer, ColoredTreeNode> map = new HashMap<>();
            for (int i = 0; i < edges.length; i++) {
                ColoredTreeNode parent =
                        map.getOrDefault(
                                edges[i][0], new ColoredTreeNode(edges[i][0], colors[edges[i][0]]));
                ColoredTreeNode child =
                        map.getOrDefault(
                                edges[i][1], new ColoredTreeNode(edges[i][1], colors[edges[i][1]]));
                parent.children.add(child);
                map.put(edges[i][0], parent);
                map.put(edges[i][1], child);
            }
            return map.get(0);
        }
    }
}
