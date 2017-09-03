package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._669;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _669Test {
    private static _669.Solution1 solution1;
    private static TreeNode root;
    private static TreeNode expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _669.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 0, 2));
        expected = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 2));
        assertEquals(expected, solution1.trimBST(root, 1, 2));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, 0, 4, null, 2, null, null, 1));
        expected = TreeUtils.constructBinaryTree(Arrays.asList(3, 2, null, 1));
        assertEquals(expected, solution1.trimBST(root, 1, 3));
    }

}