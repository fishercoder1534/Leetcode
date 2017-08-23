package com.fishercoder;

import com.fishercoder.solutions._494;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _494Test {
    private static _494 test;
    private static int expected;
    private static int actual;
    private static int S;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        test = new _494();
    }

    @Before
    public void setupForEachTest() {
        expected = 0;
        actual = 0;
        nums = new int[1000];
    }

    @Test
    public void test1() {
        S = 3;
        nums = new int[]{1, 1, 1, 1, 1};
        expected = 5;
        actual = test.findTargetSumWays(nums, S);
        assertEquals(expected, actual);
    }
}
