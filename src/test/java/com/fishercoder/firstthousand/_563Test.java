package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions.firstthousand._563;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** Created by fishercoder on 4/23/17. */
public class _563Test {
    private _563.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static TreeNode root;

    @BeforeEach
    public void setup() {
        solution1 = new _563.Solution1();
        actual = 0;
    }

    @Test
    public void test1() {
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        expected = 1;
        actual = solution1.findTilt(root);
        assertEquals(expected, actual);
    }

    @Disabled
    @Test
    public void test2() {
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        expected = 11;
        actual = solution1.findTilt(root);
        assertEquals(expected, actual);
    }
}
