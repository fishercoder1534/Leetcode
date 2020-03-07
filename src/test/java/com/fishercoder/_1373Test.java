package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._1373;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _1373Test {
    private static _1373.Solution1 solution1;
    private static TreeNode root;

    @Test
    public void test1() {
        solution1 = new _1373.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 3));
        TreeUtils.printBinaryTree(root);
        assertEquals(6, solution1.maxSumBST(root));
    }

    @Test
    public void test2() {
        solution1 = new _1373.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(5, 4, 8, 3, null, 6, 3));
        TreeUtils.printBinaryTree(root);
        assertEquals(7, solution1.maxSumBST(root));
    }

    @Test
    public void test3() {
        solution1 = new _1373.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(-4, -2, -5));
        TreeUtils.printBinaryTree(root);
        assertEquals(0, solution1.maxSumBST(root));
    }

    @Test
    public void test4() {
        solution1 = new _1373.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(4, 3, null, 1, 2));
        TreeUtils.printBinaryTree(root);
        assertEquals(2, solution1.maxSumBST(root));
    }

    @Test
    public void test5() {
        solution1 = new _1373.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 4, 3, 2, 4, 2, 5, null, null, null, null, null, null, 4, 6));
        TreeUtils.printBinaryTree(root);
        assertEquals(20, solution1.maxSumBST(root));
    }

    @Test
    public void test6() {
        solution1 = new _1373.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(4, 8, null, 6, 1, 9, null, -5, 4, null, null, null, -3, null, 10));
        TreeUtils.printBinaryTree(root);
        assertEquals(14, solution1.maxSumBST(root));
    }

}