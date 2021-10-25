package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._2007;
import com.fishercoder.solutions._222;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _222Test {
    private static _222.Solution1 solution1;
    private static _222.Solution2 solution2;
    private static int expected;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _222.Solution1();
        solution2 = new _222.Solution2();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeUtils.printBinaryTree(root);
        expected = 3;
        assertEquals(expected, solution1.countNodes(root));
        assertEquals(expected, solution2.countNodes(root));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6));
        TreeUtils.printBinaryTree(root);
        expected = 6;
        assertEquals(expected, solution1.countNodes(root));
        assertEquals(expected, solution2.countNodes(root));
    }

}
