package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.first_thousand._572;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _572Test {
    private static _572.Solution1 solution1;
    private static _572.Solution2 solution2;
    private static boolean expected;
    private static TreeNode root;
    private static TreeNode subRoot;

    @BeforeClass
    public static void setup() {
        solution1 = new _572.Solution1();
        solution2 = new _572.Solution2();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, 4, 5, 1, 2));
        TreeUtils.printBinaryTree(root);
        subRoot = TreeUtils.constructBinaryTree(Arrays.asList(4, 1, 2));
        expected = true;
        assertEquals(expected, solution1.isSubtree(root, subRoot));
        assertEquals(expected, solution2.isSubtree(root, subRoot));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, 4, 5, 1, 2, null, null, null, null, 0));
        TreeUtils.printBinaryTree(root);
        subRoot = TreeUtils.constructBinaryTree(Arrays.asList(4, 1, 2));
        expected = false;
        assertEquals(expected, solution1.isSubtree(root, subRoot));
        assertEquals(expected, solution2.isSubtree(root, subRoot));
    }

}
