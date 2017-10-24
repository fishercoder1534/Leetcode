package com.fishercoder;

import com.fishercoder.solutions._494;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _494Test {
    private static _494.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static int S;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _494.Solution1();
    }

    @Test
    public void test1() {
        S = 3;
        nums = new int[]{1, 1, 1, 1, 1};
        expected = 5;
        actual = solution1.findTargetSumWays(nums, S);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        S = 3;
        nums = new int[]{1, 1, 1, 1, 5};
        expected = 4;
        actual = solution1.findTargetSumWays(nums, S);
        assertEquals(expected, actual);
    }
}
