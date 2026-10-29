package com.fishercoder.common.classes;

import java.util.*;

public class Node {
    public int val;
    public List<Node> children;

    public Node() {
        this.children = new ArrayList<>();
    }

    public Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }

    /*
     * return a N-ary tree based on the preorder values
     */
    public static Node createNaryTree(List<Integer> values) {
        if (values == null || values.isEmpty()) {
            return null;
        }

        Node root = new Node(values.get(0));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // Index 1 in LeetCode format is always the 'null' separating the root from level 1
        int i = 2;

        while (!queue.isEmpty() && i < values.size()) {
            // Get the next parent that needs its children populated
            Node parent = queue.poll();

            // Accumulate all non-null children for this specific parent
            while (i < values.size() && values.get(i) != null) {
                Node child = new Node(values.get(i));
                parent.children.add(child);
                queue.add(child);
                i++;
            }

            // Skip the 'null' marker that ends this current parent's child group
            i++;
        }

        return root;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Node node = (Node) o;
        return val == node.val && Objects.equals(children, node.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, children);
    }
}
