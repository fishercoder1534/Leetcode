package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._450;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _450Test {
    private static _450.Solution1 solution1;
    private static TreeNode expected;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _450.Solution1();
    }

    @Test
    public void test1() {
        root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);

        expected = new TreeNode(5);
        expected.left = new TreeNode(4);
        expected.right = new TreeNode(6);
        expected.left.left = new TreeNode(2);
        expected.right.right = new TreeNode(7);

        assertEquals(expected, solution1.deleteNode(root, 3));
    }
}
