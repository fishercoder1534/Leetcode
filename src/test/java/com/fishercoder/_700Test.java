package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._700;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

public class _700Test {
    private static _700.Solution1 solution1;
    private static TreeNode root;
    private static TreeNode expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _700.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 7, 1, 3));
        expected = TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 3));
        assertEquals(expected, solution1.searchBST(root, 2));
    }
}
