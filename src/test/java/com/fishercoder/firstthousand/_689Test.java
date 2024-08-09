package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._689;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _689Test {
    private _689.Solution1 solution1;
    private static int[] nums;
    private static int[] expected;
    private static int k;

    @BeforeEach
    public void setup() {
        solution1 = new _689.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 1, 2, 6, 7, 5, 1};
        expected = new int[]{0, 3, 5};
        k = 2;
        assertArrayEquals(expected, solution1.maxSumOfThreeSubarrays(nums, 2));
    }
}
