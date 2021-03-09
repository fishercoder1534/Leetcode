package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._623;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _623Test {
    private static _623.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _623.Solution1();
    }

    @Test
    public void test1() {
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(4, 1, 1, 2, null, null, 6, 3, 1, 5));
        TreeUtils.printBinaryTree(expected);
        TreeNode inputTree = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 6, 3, 1, 5));
        TreeUtils.printBinaryTree(inputTree);
        assertEquals(expected, solution1.addOneRow(inputTree, 1, 2));
    }

    @Test
    public void test2() {
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, null, 1, 1, 3, null, null, 1));
        TreeUtils.printBinaryTree(expected);
        TreeNode inputTree = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, null, 3, 1));
        TreeUtils.printBinaryTree(inputTree);
        assertEquals(expected, solution1.addOneRow(inputTree, 1, 3));
    }

    @Test
    public void test3() {
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 5, 1, 1, 1, 1, 3, null, null, 1, 6, null, null, 7));
        TreeUtils.printBinaryTree(expected);
        TreeNode inputTree = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 5, 3, 1, 6, 7));
        TreeUtils.printBinaryTree(inputTree);
        TreeNode actual = solution1.addOneRow(inputTree, 1, 3);
        TreeUtils.printBinaryTree(actual);
        assertEquals(expected, actual);
    }

}