package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._654;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _654Test {
    private static int[] nums;
    private static TreeNode expected;
    private static _654.Solution1 solution1;
    private static _654.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _654.Solution1();
        solution2 = new _654.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{3, 2, 1, 6, 0, 5};
        expected = TreeUtils.constructBinaryTree(Arrays.asList(6, 3, 5, null, 2, 0, null, null, 1));
        assertEquals(expected, solution1.constructMaximumBinaryTree(nums));
        assertEquals(expected, solution2.constructMaximumBinaryTree(nums));
    }
}
