package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._105;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by fishercoder on 5/1/17.
 */
public class _105Test {
    private static _105 test;
    private static TreeNode expected;
    private static TreeNode actual;
    private static int[] preorder;
    private static int[] inorder;

    @BeforeClass
    public static void setup() {
        test = new _105();
    }

    @Test
    public void test1() {
        preorder = new int[]{1, 2, 3};
        inorder = new int[]{2, 1, 3};
        actual = test.buildTree(preorder, inorder);
        expected = new TreeNode(1);
        expected.left = new TreeNode(2);
        expected.right = new TreeNode(3);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        preorder = new int[]{1, 2, 4, 5, 3};
        inorder = new int[]{4, 2, 5, 1, 3};
        actual = test.buildTree(preorder, inorder);
        expected = new TreeNode(1);
        expected.left = new TreeNode(2);
        expected.right = new TreeNode(3);
        expected.left.left = new TreeNode(4);
        expected.left.right = new TreeNode(5);
        assertEquals(expected, actual);
    }
}
