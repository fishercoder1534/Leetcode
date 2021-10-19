package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._993;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

public class _993Test {
    private static _993.Solution1 solution1;
    private static _993.Solution2 solution2;
    private static TreeNode root;

    @BeforeClass
    public static void setUp() {
        solution1 = new _993.Solution1();
        solution2 = new _993.Solution2();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4));
        TreeUtils.printBinaryTree(root);
        assertEquals(false, solution1.isCousins(root, 4, 3));
        assertEquals(false, solution2.isCousins(root, 4, 3));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, null, 4, null, 5));
        TreeUtils.printBinaryTree(root);
        assertEquals(true, solution1.isCousins(root, 5, 4));
        assertEquals(true, solution2.isCousins(root, 5, 4));
    }

    @Test
    public void test3() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, null, 4));
        TreeUtils.printBinaryTree(root);
        assertEquals(false, solution1.isCousins(root, 2, 3));
        assertEquals(false, solution2.isCousins(root, 2, 3));
    }
}
