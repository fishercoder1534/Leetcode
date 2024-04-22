package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._1026;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _1026Test {
    private static _1026.Solution1 solution1;
    private static TreeNode root;

    @Test
    public void test1() {
        solution1 = new _1026.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(8, 3, 10, 1, 6, null, 14, null, null, 4, 7, 13));
        assertEquals(7, solution1.maxAncestorDiff(root));
    }

    @Test
    public void test2() {
        solution1 = new _1026.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 2, null, 0, 3));
        assertEquals(3, solution1.maxAncestorDiff(root));
    }

}
