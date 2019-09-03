package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._662;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class _662Test {
    private static _662.Solution1 solution1;
    private static TreeNode root;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _662.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 3, 2, 5, 3, null, 9));
        expected = 4;
        assertEquals(expected, solution1.widthOfBinaryTree(root));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 3, null, 5, 3));
        expected = 2;
        assertEquals(expected, solution1.widthOfBinaryTree(root));
    }

    @Test
    public void test3() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 3, 2, 5));
        expected = 2;
        assertEquals(expected, solution1.widthOfBinaryTree(root));
    }

    @Test
    @Ignore
    /**TODO: need to figure out how to pass in the input for the 4th example on Leetcode*/
    public void test4() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 3, 2, 5, null, null, 9, 6, null, null, null, null, null, null, 7));
        expected = 8;
        assertEquals(expected, solution1.widthOfBinaryTree(root));
    }

    @Test
    public void test5() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1));
        expected = 1;
        assertEquals(expected, solution1.widthOfBinaryTree(root));
    }
}
