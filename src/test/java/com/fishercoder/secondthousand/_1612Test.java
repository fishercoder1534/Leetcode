package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1612;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class _1612Test {
    private _1612.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1612.Solution1();
    }

    @Test
    public void test1() {
        _1612.Node root1 = new _1612.Node('+');
        root1.left = new _1612.Node('a');
        root1.right = new _1612.Node('+');
        root1.right.left = new _1612.Node('b');
        root1.right.right = new _1612.Node('c');

        _1612.Node root2 = new _1612.Node('+');
        root2.left = new _1612.Node('+');
        root2.right = new _1612.Node('a');
        root2.left.left = new _1612.Node('b');
        root2.left.right = new _1612.Node('c');
        assertTrue(solution1.checkEquivalence(root1, root2));
    }
}
