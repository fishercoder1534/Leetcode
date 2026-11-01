package com.fishercoder.secondthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1123;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1123Test {
    private _1123.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1123.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));
        TreeUtils.printBinaryTree(root);
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(2, 7, 4));
        TreeUtils.printBinaryTree(expected);
        assertEquals(
                expected,
                solution1.lcaDeepestLeaves(root));
    }
}
