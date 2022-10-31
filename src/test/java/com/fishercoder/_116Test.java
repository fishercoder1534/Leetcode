package com.fishercoder;

import com.fishercoder.solutions._116;
import org.junit.BeforeClass;
import org.junit.Test;

public class _116Test {
    private static _116.Solution1 solution1;
    private static _116.Solution2 solution2;
    private static _116.Node root;

    @BeforeClass
    public static void setup() {
        solution1 = new _116.Solution1();
        solution2 = new _116.Solution2();
    }

    @Test
    public void test1() {
        root = new _116.Node(1);
        root.left = new _116.Node(2);
        root.right = new _116.Node(3);
        root.left.left = new _116.Node(4);
        root.left.right = new _116.Node(5);
        root.right.right = new _116.Node(7);
        solution1.connect(root);
    }

    @Test
    public void test2() {
        root = new _116.Node(1);
        root.left = new _116.Node(2);
        root.right = new _116.Node(3);
        root.left.left = new _116.Node(4);
        root.left.right = new _116.Node(5);
        root.right.right = new _116.Node(7);

        solution2.connect(root);
    }
}
