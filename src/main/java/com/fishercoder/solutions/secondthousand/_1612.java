package com.fishercoder.solutions.secondthousand;

import java.util.*;

public class _1612 {
    public static class Node {
        public char val;
        public Node left;
        public Node right;

        public Node() {
            this.val = ' ';
        }

        public Node(char val) {
            this.val = val;
        }

        public Node(char val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class Solution1 {
        public boolean checkEquivalence(Node root1, Node root2) {
            Map<Character, Integer> map1 = new HashMap<>();
            inorder(root1, map1);
            Map<Character, Integer> map2 = new HashMap<>();
            inorder(root2, map2);
            return map1.equals(map2);
        }

        private Map<Character, Integer> inorder(Node root, Map<Character, Integer> map) {
            if (root == null) {
                return map;
            }
            inorder(root.left, map);
            if (root.left == null && root.right == null && root.val != '+') {
                map.put(root.val, map.getOrDefault(root.val, 0) + 1);
            }
            inorder(root.right, map);
            return map;
        }
    }
}
