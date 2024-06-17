package com.fishercoder;

import com.fishercoder.solutions.firstthousand._426;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _426Test {
    private static _426.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _426.Solution1();
    }

    @Test
    public void test1() {
        _426.Node node1 = new _426.Node(1);
        _426.Node node3 = new _426.Node(3);
        _426.Node node5 = new _426.Node(5);
        _426.Node node2 = new _426.Node(2);
        node2.left = node1;
        node2.right = node3;
        _426.Node node4 = new _426.Node(4);
        node4.left = node2;
        node4.right = node5;
        _426.Node actual = solution1.treeToDoublyList(node4);
        System.out.println("Finished.");
    }

}
