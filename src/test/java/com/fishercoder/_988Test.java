package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._988;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _988Test {
    private static _988.Solution1 solution1;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _988.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(0, 1, 2, 3, 4, 3, 4));
        assertEquals("dba", solution1.smallestFromLeaf(root));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(25, 1, 3, 1, 3, 0, 2));
        assertEquals("adz", solution1.smallestFromLeaf(root));
    }

    @Test
    public void test3() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(2, 2, 1, null, 1, 0, null, 0));
        assertEquals("abc", solution1.smallestFromLeaf(root));
    }

}
