package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._1372;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _1372Test {
    private static _1372.Solution1 solution1;
    private static TreeNode root;

    @Test
    public void test1() {
        solution1 = new _1372.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 1, 1, 1, null, null, 1, 1, null, 1, null, null, null, 1, null, 1));
        TreeUtils.printBinaryTree(root);
        assertEquals(3, solution1.longestZigZag(root));
    }

    @Test
    public void test2() {
        solution1 = new _1372.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 1, 1, null, 1, null, null, 1, 1, null, 1));
        TreeUtils.printBinaryTree(root);
        assertEquals(4, solution1.longestZigZag(root));
    }

    @Test
    public void test3() {
        solution1 = new _1372.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(1));
        TreeUtils.printBinaryTree(root);
        assertEquals(0, solution1.longestZigZag(root));
    }

}