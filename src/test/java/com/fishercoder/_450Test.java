package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._450;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 5/29/17.
 */
public class _450Test {
    private static _450 test;
    private static TreeNode expected;
    private static TreeNode actual;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
        test = new _450();
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

        assertEquals(expected, test.deleteNode(root, 3));
    }
}
