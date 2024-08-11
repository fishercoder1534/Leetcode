package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._99;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _99Test {
    private _99.Solution1 solution1;
    private static TreeNode root;

    @BeforeEach
    public void setup() {
        solution1 = new _99.Solution1();
    }

    @Test
    public void test1() {
        root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        TreeUtils.printBinaryTree(root);
        solution1.recoverTree(root);
        TreeUtils.printBinaryTree(root);
    }

    @Test
    public void test2() {
        root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        TreeUtils.printBinaryTree(root);
        solution1.recoverTree(root);
        TreeUtils.printBinaryTree(root);
    }

}
