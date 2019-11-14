package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._100;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _100Test {
    private static _100.Solution1 solution1;
    private static TreeNode p;
    private static TreeNode q;

    @BeforeClass
    public static void setup() {
        solution1 = new _100.Solution1();
    }

    @Test
    public void test1() {
        p = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeUtils.printBinaryTree(p);
        q = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeUtils.printBinaryTree(p);
        assertEquals(true, solution1.isSameTree(p, q));
    }

    @Test
    public void test2() {
        p = TreeUtils.constructBinaryTree(Arrays.asList(1, 2));
        TreeUtils.printBinaryTree(p);
        q = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 2));
        TreeUtils.printBinaryTree(p);
        assertEquals(false, solution1.isSameTree(p, q));
    }

    @Test
    public void test3() {
        p = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 1));
        TreeUtils.printBinaryTree(p);
        q = TreeUtils.constructBinaryTree(Arrays.asList(1, 1, 2));
        TreeUtils.printBinaryTree(p);
        assertEquals(false, solution1.isSameTree(p, q));
    }
}
