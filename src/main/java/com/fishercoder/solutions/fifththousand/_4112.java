package com.fishercoder.solutions.fifththousand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _4112 {
    public static class Solution1 {
        /**
         * My original solution and got it AC'd during the contest! Yeah!
         */
        class Node {
            int score;
            List<Node> children;
            int operation;
            int parent;
            int val;

            public Node(int parent, int op, int score, int val) {
                this.parent = parent;
                this.operation = op;
                this.score = score;
                this.children = new ArrayList<>();
                this.val = val;
            }
        }

        public int maxScore(int[] parent, int[] op, int[] score) {
            Node root = buildNaryTree(parent, op, score);
            return postOrderDfs(root);
        }

        private int postOrderDfs(Node root) {
            //base case
            if (root == null) {
                return 0;
            }
            //if it's leaf, we don't need to do anything
            if (root.children.isEmpty()) {
                return root.score;
            }

            //now we traverse through all of its children
            int op = root.operation;
            int minValue = Integer.MAX_VALUE;
            int sum = root.score;
            for (Node child : root.children) {
                int thisVal = postOrderDfs(child);
                sum += thisVal;
                if (thisVal < minValue) {
                    minValue = thisVal;
                }
            }
            if (op == 1) {
                sum -= minValue;
            } else {
                if (minValue < 0) {
                    sum -= minValue;
                }
            }
            return sum;
        }

        private Node buildNaryTree(int[] parents, int[] ops, int[] scores) {
            Map<Integer, Node> map = new HashMap<>();
            for (int i = 0; i < parents.length; i++) {
                map.put(i, new Node(i, ops[i], scores[i], parents[i]));
            }
            for (int i = 1; i < parents.length; i++) {
                Node parentNode = map.get(parents[i]);
                Node childNode = map.get(i);
                parentNode.children.add(childNode);
            }
            return map.get(0);
        }
    }
}
