package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.firstthousand._480;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Created by fishercoder on 5/27/17. */
public class _480Test {
    private _480.Solution1 solution1;
    private static int[] nums;
    private static double[] expected;
    private static int k;

    @BeforeEach
    public void setup() {
        solution1 = new _480.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {1, 3, -1, -3, 5, 3, 6, 7};
        expected = new double[] {1, -1, -1, 3, 5, 6};
        k = 3;
        assertArrayEquals(expected, solution1.medianSlidingWindow(nums, k), 0);
    }
}
