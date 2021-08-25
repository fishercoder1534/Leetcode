package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._1644;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _1644Test {
    private static _1644.Solution1 solution1;

    @Test
    public void test1() {
        solution1 = new _1644.Solution1();
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));
        TreeUtils.printBinaryTree(root);
        TreeNode p = TreeUtils.constructBinaryTree(Arrays.asList(5, 6, 2, null, null, 7, 4));
        TreeUtils.printBinaryTree(p);
        TreeNode q = new TreeNode(10);
        TreeNode actual = solution1.lowestCommonAncestor(root, p, q);
        System.out.println("actual: " + actual);
        assertEquals(null, actual);
    }
}
