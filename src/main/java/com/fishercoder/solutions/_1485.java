package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1485 {
    public static class Solution1 {
        public NodeCopy copyRandomBinaryTree(Node root) {
            if (root == null) {
                return null;
            }
            Map<Node, NodeCopy> map = new HashMap<>();
            map.put(root, new NodeCopy(root.val));
            dfs(root, map);
            dfsAgain(root, map);
            return map.get(root);
        }

        private void dfsAgain(Node root, Map<Node, NodeCopy> map) {
            if (root == null) {
                return;
            }
            NodeCopy copy = map.get(root);
            if (root.left != null) {
                copy.left = map.get(root.left);
            }
            if (root.right != null) {
                copy.right = map.get(root.right);
            }
            if (root.random != null) {
                copy.random = map.get(root.random);
            }
            map.put(root, copy);
            dfsAgain(root.left, map);
            dfsAgain(root.right, map);
        }

        private void dfs(Node root, Map<Node, NodeCopy> map) {
            if (root == null) {
                return;
            }
            NodeCopy copy = map.getOrDefault(root, new NodeCopy(root.val));
            if (root.left != null) {
                copy.left = new NodeCopy(root.left.val);
            }
            if (root.right != null) {
                copy.right = new NodeCopy(root.right.val);
            }
            if (root.random != null) {
                copy.random = new NodeCopy(root.random.val);
            }
            map.put(root, copy);
            dfs(root.left, map);
            dfs(root.right, map);
        }
    }

    public static class Node {
        int val;
        public Node left;
        public Node right;
        public Node random;

        public Node() {
        }

        ;

        public Node(int val) {
            this.val = val;
        }

        ;

        public Node(int val, Node left, Node right, Node random) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.random = random;
        }
    }

    public static class NodeCopy {
        int val;
        public NodeCopy left;
        public NodeCopy right;
        public NodeCopy random;

        public NodeCopy() {
        }

        ;

        public NodeCopy(int val) {
            this.val = val;
        }

        ;

        public NodeCopy(int val, NodeCopy left, NodeCopy right, NodeCopy random) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.random = random;
        }
    }
}
