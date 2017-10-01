package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._549;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

public class _549Test {
    private static _549.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
    }

    @Before
    public void setupForEachTest() {
        root = null;
        actual = 0;
        solution1 = new _549.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        actual = solution1.longestConsecutive(root);
        expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 3));
        actual = solution1.longestConsecutive(root);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1));
        actual = solution1.longestConsecutive(root);
        expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, null, 3, null, 4));
        TreeUtils.printBinaryTree(root);
        actual = solution1.longestConsecutive(root);
        expected = 4;
        assertEquals(expected, actual);
    }
}
