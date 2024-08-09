package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._701;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class _701Test {
    private _701.Solution1 solution1;
    private _701.Solution2 solution2;

    @BeforeEach
    public void setup() {
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