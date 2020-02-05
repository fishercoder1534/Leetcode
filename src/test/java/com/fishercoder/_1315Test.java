package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._1315;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _1315Test {
    private static _1315.Solution1 solution1;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _1315.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5));
        TreeUtils.printBinaryTree(root);
        assertEquals(18, solution1.sumEvenGrandparent(root));
    }
}
