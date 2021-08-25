package com.fishercoder.common.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    //todo: implement this method

    /**
     * return a N-ary tree based on the preorder values
     */
    public static Node createNaryTree(List<Integer> preorderValues) {
        return null;
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
