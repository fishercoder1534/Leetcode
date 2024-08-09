package com.fishercoder.secondthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1038;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1038Test {
    
    private _1038.Solution1 solution1;
    private static TreeNode root;
    private static TreeNode expected;
    private static TreeNode actual;

    @BeforeEach
    public void setup() {
        solution1 = new _1038.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8));
        TreeUtils.printBinaryTree(root);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null, 8));
        TreeUtils.printBinaryTree(expected);
        actual = solution1.bstToGst(root);
        TreeUtils.printBinaryTree(actual);
        assertEquals(expected, actual);
    }

}