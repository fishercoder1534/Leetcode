package com.fishercoder.secondthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1008;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1008Test {
    private _1008.Solution1 solution1;
    private _1008.Solution2 solution2;
    private static int[] preorder;
    private static TreeNode expected;
    private static TreeNode actual;

    @Test
    public void test1() {
        solution1 = new _1008.Solution1();
        solution2 = new _1008.Solution2();
        preorder = new int[]{8, 5, 1, 7, 10, 12};
        expected = TreeUtils.constructBinaryTree(Arrays.asList(8, 5, 10, 1, 7, null, 12));
        TreeUtils.printBinaryTree(expected);
        actual = solution1.bstFromPreorder(preorder);
        TreeUtils.printBinaryTree(actual);
        assertEquals(expected, actual);
        actual = solution2.bstFromPreorder(preorder);
        TreeUtils.printBinaryTree(actual);
        assertEquals(expected, actual);
    }

}