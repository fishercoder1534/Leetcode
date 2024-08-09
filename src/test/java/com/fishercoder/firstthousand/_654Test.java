package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._654;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _654Test {
    private static int[] nums;
    private static TreeNode expected;
    private _654.Solution1 solution1;
    private _654.Solution2 solution2;

    @BeforeEach
    public void setup() {
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
