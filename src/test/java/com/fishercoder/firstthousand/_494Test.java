package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._494;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _494Test {
    private _494.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static int S;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _494.Solution1();
    }

    @Test
    public void test1() {
        S = 3;
        nums = new int[] {1, 1, 1, 1, 1};
        expected = 5;
        actual = solution1.findTargetSumWays(nums, S);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        S = 3;
        nums = new int[] {1, 1, 1, 1, 5};
        expected = 4;
        actual = solution1.findTargetSumWays(nums, S);
        assertEquals(expected, actual);
    }
}
