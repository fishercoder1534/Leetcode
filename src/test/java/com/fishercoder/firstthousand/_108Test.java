package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._108;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _108Test {
    private _108.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _108.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 3};
        TreeUtils.printBinaryTree(solution1.sortedArrayToBST(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{};
        TreeUtils.printBinaryTree(solution1.sortedArrayToBST(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{-10, -3, 0, 5, 9};
        TreeUtils.printBinaryTree(solution1.sortedArrayToBST(nums));
    }

}