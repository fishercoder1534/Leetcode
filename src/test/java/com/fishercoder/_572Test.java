package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._572;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/6/17.
 */
public class _572Test {
    private static _572.Solution1 solution1;
    private static boolean expected;
    private static boolean actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _572.Solution1();
    }

    @Test
    public void test1() {
        TreeNode s = new TreeNode(3);
        s.left = new TreeNode(4);
        s.right = new TreeNode(5);
        s.left.left = new TreeNode(1);
        s.left.right = new TreeNode(2);
        s.left.right.left = new TreeNode(0);

        TreeNode t = new TreeNode(4);
        t.left = new TreeNode(1);
        t.right = new TreeNode(2);
        expected = false;
        actual = solution1.isSubtree(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        TreeNode s = new TreeNode(3);
        s.left = new TreeNode(4);
        s.right = new TreeNode(5);
        s.left.left = new TreeNode(1);
        s.left.right = new TreeNode(2);

        TreeNode t = new TreeNode(4);
        t.left = new TreeNode(1);
        t.right = new TreeNode(2);
        expected = true;
        actual = solution1.isSubtree(s, t);
        assertEquals(expected, actual);
    }
}
