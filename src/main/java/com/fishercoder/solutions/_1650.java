package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _1650 {
    class Node {
        public int val;
        public Node parent;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static class Solution1 {
        public Node lowestCommonAncestor(Node p, Node q) {
            Node a = p, b = q;
            while (a != b) {
                a = a == null ? p : a.parent;
                b = b == null ? q : b.parent;
            }
            return a;
        }
    }

    public static class Solution2 {
        public Node lowestCommonAncestor(Node p, Node q) {
            Set<Node> set = new HashSet<>();
            while (p != null) {
                set.add(p);
                p = p.parent;
            }
            while (q != null) {
                if (set.contains(q)) {
                    return q;
                }
                q = q.parent;
            }
            return null;
        }
    }
}
