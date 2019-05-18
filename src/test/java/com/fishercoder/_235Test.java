package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._235;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _235Test {
    private static _235.Solution1 solution1;
    private static TreeNode root;
    private static TreeNode p;
    private static TreeNode q;

    @BeforeClass
    public static void setup() {
        solution1 = new _235.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(6, 2, 8, 0, 4, 7, 9, 3, 5));
        TreeUtils.printBinaryTree(root);

        p = TreeUtils.constructBinaryTree(Arrays.asList(2, 0, 4, 3, 5));
        TreeUtils.printBinaryTree(p);

        q = TreeUtils.constructBinaryTree(Arrays.asList(8, 7, 9));
        TreeUtils.printBinaryTree(q);

        assertEquals(root, solution1.lowestCommonAncestor(root, p, q));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(6, 2, 8, 0, 4, 7, 9, 3, 5));
        TreeUtils.printBinaryTree(root);

        p = TreeUtils.constructBinaryTree(Arrays.asList(2, 0, 4, 3, 5));
        TreeUtils.printBinaryTree(p);

        q = TreeUtils.constructBinaryTree(Arrays.asList(4));
        TreeUtils.printBinaryTree(q);

        assertEquals(p, solution1.lowestCommonAncestor(root, p, q));
    }
}
