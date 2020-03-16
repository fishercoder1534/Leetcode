package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._1382;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

public class _1382Test {
    private static _1382.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1382.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 2, null, 3, null, 4, null, null));
        TreeUtils.printBinaryTree(root);
        TreeUtils.printBinaryTree(solution1.balanceBST(root));
    }

    @Test
    public void test2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 2, null, 3, null, 4, null, 5, null, null));
        TreeUtils.printBinaryTree(root);
        TreeUtils.printBinaryTree(solution1.balanceBST(root));
    }

}