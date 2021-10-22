package com.fishercoder;

import com.fishercoder.solutions._11;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _11Test {
    private static _11.Solution1 solution1;
    private static _11.Solution2 solution2;
    private static int[] height;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _11.Solution1();
        solution2 = new _11.Solution2();
    }

    @Test
    public void test1() {
        height = new int[]{1, 1};
        expected = 1;
        assertEquals(expected, solution1.maxArea(height));
        assertEquals(expected, solution2.maxArea(height));
    }

}