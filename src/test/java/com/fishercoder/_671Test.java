package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._671;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _671Test {
    private static _671.Solution1 solution1;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _671.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(2, 2, 5, null, null, 5, 7));
        assertEquals(5, solution1.findSecondMinimumValue(root));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(2, 2, 2));
        assertEquals(-1, solution1.findSecondMinimumValue(root));
    }

}