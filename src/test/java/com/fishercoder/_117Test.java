package com.fishercoder;

import com.fishercoder.common.classes.TreeLinkNode;
import com.fishercoder.solutions._117;
import org.junit.BeforeClass;
import org.junit.Test;

public class _117Test {
    private static _117.Solution1 solution1;
    private static TreeLinkNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _117.Solution1();
    }

    @Test
    public void test1() {
        root = new TreeLinkNode(1);
        root.left = new TreeLinkNode(2);
        root.right = new TreeLinkNode(3);
        root.left.left = new TreeLinkNode(4);
        root.left.right = new TreeLinkNode(5);
        root.right.right = new TreeLinkNode(7);

        solution1.connect(root);
    }
}
