package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._230;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/19/17.
 */
public class _230Test {
    private static _230.Solution1 solution1;
    private static TreeNode root;
    private static int k;

    @BeforeClass
    public static void setup() {
        solution1 = new _230.Solution1();
    }

    @Test
    public void test1() {
        root = new TreeNode(1);
        k = 1;
        assertEquals(1, solution1.kthSmallest(root, k));
    }

    @Test
    public void test2() {
        root = new TreeNode(2);
        root.left = new TreeNode(1);
        k = 1;
        assertEquals(1, solution1.kthSmallest(root, k));
    }
}
