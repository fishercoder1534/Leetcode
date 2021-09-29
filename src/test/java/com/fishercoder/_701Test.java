package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._701;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

public class _701Test {
    private static _701.Solution1 solution1;
    private static _701.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _701.Solution1();
        solution2 = new _701.Solution2();
    }

    @Test
    public void test1() {
        int val = 88;
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(61, 46, 66, 43, null, null, null, 39, null, null, null));
        TreeUtils.printBinaryTree(root);
        TreeUtils.printBinaryTree(solution1.insertIntoBST(root, val));
    }

    @Test
    public void test2() {
        int val = 88;
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(61, 46, 66, 43, null, null, null, 39, null, null, null));
        TreeUtils.printBinaryTree(root);
        TreeUtils.printBinaryTree(solution2.insertIntoBST(root, val));
    }

    @Test
    public void test3() {
        int val = 5;
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 7, 1, 3));
        TreeUtils.printBinaryTree(root);
        TreeUtils.printBinaryTree(solution2.insertIntoBST(root, val));
    }

}