package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._101;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _101Test {
    private static _101.Solution1 solution1;
    private static _101.Solution2 solution2;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _101.Solution1();
        solution2 = new _101.Solution2();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 2, 3, 4, 4, 3));
        assertEquals(true, solution1.isSymmetric(root));
        assertEquals(true, solution2.isSymmetric(root));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 2, null, 3, null, 3));
        assertEquals(false, solution1.isSymmetric(root));
        assertEquals(false, solution2.isSymmetric(root));
    }
}
