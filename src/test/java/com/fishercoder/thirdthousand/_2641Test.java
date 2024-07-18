package com.fishercoder.thirdthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.thirdthousand._2641;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2641Test {
    private static _2641.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2641.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(5, 4, 9, 1, 10, null, 7));
        TreeUtils.printBinaryTree(root);
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(0, 0, 0, 7, 7, null, 11));
        TreeUtils.printBinaryTree(expected);
        TreeNode actual = solution1.replaceValueInTree(root);
        TreeUtils.printBinaryTree(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(49, 40, 35, 42, 7, null, null, 50, null, null, 44, null, null, null, 27, 21));
        TreeUtils.printBinaryTree(root);
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(0, 0, 0, 0, 0, null, null, 44, null, null, 50, null, null, null, 0, 0));
        TreeUtils.printBinaryTree(expected);
        TreeNode actual = solution1.replaceValueInTree(root);
        TreeUtils.printBinaryTree(actual);
        assertEquals(expected, actual);
    }
}
