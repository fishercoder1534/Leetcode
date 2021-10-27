package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._105;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _105Test {
    private static _105.Solution1 solution1;
    private static TreeNode expected;
    private static TreeNode actual;
    private static int[] preorder;
    private static int[] inorder;

    @BeforeClass
    public static void setup() {
        solution1 = new _105.Solution1();
    }

    @Test
    public void test1() {
        preorder = new int[]{1, 2, 3};
        inorder = new int[]{2, 1, 3};
        actual = solution1.buildTree(preorder, inorder);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        preorder = new int[]{1, 2, 4, 5, 3};
        inorder = new int[]{4, 2, 5, 1, 3};
        actual = solution1.buildTree(preorder, inorder);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        preorder = new int[]{3, 9, 20, 15, 7};
        inorder = new int[]{9, 3, 15, 20, 7};
        actual = solution1.buildTree(preorder, inorder);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        preorder = new int[]{3, 1, 2, 4};
        inorder = new int[]{1, 2, 3, 4};
        actual = solution1.buildTree(preorder, inorder);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(3, 1, 4, null, 2));
        TreeUtils.printBinaryTree(expected);
        assertEquals(expected, actual);
    }
}
