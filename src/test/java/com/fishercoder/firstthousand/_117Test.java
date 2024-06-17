package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._117;
import org.junit.BeforeClass;
import org.junit.Test;

public class _117Test {
    private static _117.Solution1 solution1;
    private static _117.Node root;

    @BeforeClass
    public static void setup() {
        solution1 = new _117.Solution1();
    }

    @Test
    public void test1() {
        root = new _117.Node(1);
        root.left = new _117.Node(2);
        root.right = new _117.Node(3);
        root.left.left = new _117.Node(4);
        root.left.right = new _117.Node(5);
        root.right.right = new _117.Node(7);

        solution1.connect(root);
    }
}
