package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1485;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1485Test {

    private _1485.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1485.Solution1();
    }

    @Test
    public void test1() {
        _1485.Node root = new _1485.Node(1);
        _1485.Node node1 = new _1485.Node(4);
        _1485.Node node2 = new _1485.Node(7);
        root.right = node1;
        node1.left = node2;
        node1.random = node2;
        node2.random = root;
        _1485.NodeCopy actual = solution1.copyRandomBinaryTree(root);
        System.out.println("Finished.");
    }
}
