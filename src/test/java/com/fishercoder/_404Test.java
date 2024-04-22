package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._404;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class _404Test {
    private static _404.Solution1 solution1;
    private static _404.Solution2 solution2;
    private static _404.Solution3 solution3;
    private static TreeNode root;
    private static int expected;

    @BeforeClass
    public static void setup() {
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