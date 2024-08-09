package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._404;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _404Test {
    private _404.Solution1 solution1;
    private _404.Solution2 solution2;
    private _404.Solution3 solution3;
    private static TreeNode root;
    private static int expected;

    @BeforeEach
    public void setup() {
        solution1 = new _404.Solution1();
        solution2 = new _404.Solution2();
        solution3 = new _404.Solution3();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        expected = 24;
        assertEquals(expected, solution1.sumOfLeftLeaves(root));
        assertEquals(expected, solution2.sumOfLeftLeaves(root));
        assertEquals(expected, solution3.sumOfLeftLeaves(root));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 2));
        expected = 0;
        assertEquals(expected, solution1.sumOfLeftLeaves(root));
        assertEquals(expected, solution2.sumOfLeftLeaves(root));
        assertEquals(expected, solution3.sumOfLeftLeaves(root));
    }

}