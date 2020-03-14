package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._1379;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

public class _1379Test {
    private static _1379.Solution1 solution1;
    private static TreeNode original;
    private static TreeNode cloned;
    private static TreeNode target;

    @BeforeClass
    public static void setup() {
        solution1 = new _1379.Solution1();
    }

    @Test
    public void test1() {
        original = TreeUtils.constructBinaryTree(Arrays.asList(7, 4, 3, null, null, 6, 19));
        cloned = TreeUtils.constructBinaryTree(Arrays.asList(7, 4, 3, null, null, 6, 19));
        target = TreeUtils.constructBinaryTree(Arrays.asList(3, 6, 19));
        TreeUtils.printBinaryTree(solution1.getTargetCopy(original, cloned, target));
    }

    @Test
    public void test2() {
        original = TreeUtils.constructBinaryTree(Arrays.asList(7));
        cloned = TreeUtils.constructBinaryTree(Arrays.asList(7));
        target = TreeUtils.constructBinaryTree(Arrays.asList(7));
        TreeUtils.printBinaryTree(solution1.getTargetCopy(original, cloned, target));
    }

    @Test
    public void test3() {
        original = TreeUtils.constructBinaryTree(Arrays.asList(8, null, 6, null, 5, null, 4, null, 3, null, 2, null, 1));
        cloned = TreeUtils.constructBinaryTree(Arrays.asList(8, null, 6, null, 5, null, 4, null, 3, null, 2, null, 1));
        target = TreeUtils.constructBinaryTree(Arrays.asList(4, null, 3, null, 2, null, 1));
        TreeUtils.printBinaryTree(solution1.getTargetCopy(original, cloned, target));
    }

    @Test
    public void test4() {
        original = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        cloned = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        target = TreeUtils.constructBinaryTree(Arrays.asList(5, 10));
        TreeUtils.printBinaryTree(solution1.getTargetCopy(original, cloned, target));
    }

    @Test
    public void test5() {
        original = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, null, 3));
        cloned = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, null, 3));
        target = TreeUtils.constructBinaryTree(Arrays.asList(2, 3));
        TreeUtils.printBinaryTree(solution1.getTargetCopy(original, cloned, target));
    }

}