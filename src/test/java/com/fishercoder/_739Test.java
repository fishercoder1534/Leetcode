package com.fishercoder;

import com.fishercoder.solutions._739;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _739Test {
    private static _739.Solution1 solution1;
    private static int[] temperatures;
    private static int[] expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _739.Solution1();
    }

    @Test
    public void test1() {
        temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, solution1.dailyTemperatures(temperatures));
    }

}