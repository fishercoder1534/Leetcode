package com.fishercoder;

import com.fishercoder.common.classes.TreeLinkNode;
import com.fishercoder.solutions._116;
import org.junit.BeforeClass;
import org.junit.Test;

public class _116Test {
    private static _116.Solution1 solution1;
    private static _116.Solution2 solution2;
    private static TreeLinkNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _116.Solution1();
        solution2 = new _116.Solution2();
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

    @Test
    public void test2() {
        root = new TreeLinkNode(1);
        root.left = new TreeLinkNode(2);
        root.right = new TreeLinkNode(3);
        root.left.left = new TreeLinkNode(4);
        root.left.right = new TreeLinkNode(5);
        root.right.right = new TreeLinkNode(7);

        solution2.connect(root);
    }
}
