package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._662;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _662Test {
    private _662.Solution1 solution1;
    private static TreeNode root;
    private static int expected;

    @BeforeEach
    public void setup() {
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
    @Disabled
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
