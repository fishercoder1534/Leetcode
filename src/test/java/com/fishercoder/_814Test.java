package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._814;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

public class _814Test {
    private static _814.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _814.Solution1();
    }

    @Test
    public void test1() {
        TreeUtils.printBinaryTree(solution1.pruneTree(TreeUtils.constructBinaryTree(Arrays.asList(1, null, 0, 0, 1))));
    }

    @Test
    public void test2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 0, 1, 0, 0, 0, 1));
        TreeUtils.printBinaryTree(root);
        TreeUtils.printBinaryTree(solution1.pruneTree(root));
    }

}