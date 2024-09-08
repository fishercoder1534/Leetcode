package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions.firstthousand._530;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _530Test {
    private _530.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static TreeNode root;

    @BeforeEach
    public void setup() {
        solution1 = new _530.Solution1();
    }

    @BeforeEach
    public void setupForEachTest() {
        expected = 0;
        actual = 0;
    }

    @Test
    public void test1() {
        root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
        expected = 1;
        actual = solution1.getMinimumDifference(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        root = new TreeNode(1);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(3);
        expected = 2;
        actual = solution1.getMinimumDifference(root);
        assertEquals(expected, actual);
    }

    //    [543,384,652,null,445,null,699]
    @Test
    public void test3() {
        root = new TreeNode(543);
        root.left = new TreeNode(384);
        root.right = new TreeNode(652);
        root.left.right = new TreeNode(445);
        root.right.right = new TreeNode(699);
        expected = 47;
        actual = solution1.getMinimumDifference(root);
        assertEquals(expected, actual);
    }
}
