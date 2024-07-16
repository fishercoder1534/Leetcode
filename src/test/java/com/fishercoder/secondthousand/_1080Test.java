package com.fishercoder.secondthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1080;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1080Test {
    private static _1080.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1080.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, -3, -5, null, 4, null));
        TreeUtils.printBinaryTree(root);
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(1, null, -3, 4));
        TreeUtils.printBinaryTree(expected);
        assertEquals(expected, solution1.sufficientSubset(root, -1));
    }

    @Test
    public void test2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, -3, -5, 3, null, 4, null));
        TreeUtils.printBinaryTree(root);
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, -3, null, 3, null, 4));
        TreeUtils.printBinaryTree(expected);
        assertEquals(expected, solution1.sufficientSubset(root, -1));
    }

    @Test
    public void test3() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(5, 4, 8, 11, null, 17, 4, 7, 1, null, null, 5, 3));
        TreeUtils.printBinaryTree(root);
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(5, 4, 8, 11, null, 17, 4, 7, null, null, null, 5));
        TreeUtils.printBinaryTree(expected);
        assertEquals(expected, solution1.sufficientSubset(root, 22));
    }
}
