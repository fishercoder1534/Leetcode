package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions.firstthousand._513;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by fishercoder on 1/15/17.
 */
public class _513Test {
    private _513.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static TreeNode root;

    @BeforeEach
    public void setup() {
        solution1 = new _513.Solution1();
    }

    @BeforeEach
    public void setupForEachTest() {
        expected = 0;
        actual = 0;
        root = new TreeNode(0);
    }

    @Test
    public void test1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        expected = 1;
        actual = solution1.findBottomLeftValue(root);
        assertEquals(expected, actual);

    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        expected = 7;
        actual = solution1.findBottomLeftValue(root);
        assertEquals(expected, actual);
    }
}
