package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._156;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _156Test {
    private static _156.Solution1 solution1;
    private static TreeNode root;
    private static TreeNode expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _156.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5));
        expected = TreeUtils.constructBinaryTree(Arrays.asList(4, 5, 2, null, null, 3, 1));
        assertEquals(expected, solution1.upsideDownBinaryTree(root));
    }

}