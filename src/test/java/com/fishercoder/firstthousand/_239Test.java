package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._239;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _239Test {
    private _239.Solution1 solution1;
    private static int[] expected;
    private static int[] actual;
    private static int[] nums;
    private static int k;

    @BeforeEach
    public void setup() {
        solution1 = new _239.Solution1();
    }

    @BeforeEach
    public void setupForEachTest() {
        expected = new int[] {};
        actual = new int[] {};
        nums = new int[] {};
        k = 0;
    }

    @Test
    public void test1() {

        nums = new int[] {1, 3, -1, -3, 5, 3, 6, 7};
        k = 3;
        expected = new int[] {3, 3, 5, 5, 6, 7};
        actual = solution1.maxSlidingWindow(nums, k);
        Assertions.assertArrayEquals(expected, actual);
    }
}
