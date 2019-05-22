package com.fishercoder;

import com.fishercoder.solutions._502;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _502Test {
    private static _502.Solution1 solution1;
    private static int[] Profits;
    private static int[] Capital;

    @BeforeClass
    public static void setup() {
        solution1 = new _502.Solution1();
    }

    @Test
    public void test1() {
        Profits = new int[]{1, 2, 3};
        Capital = new int[]{0, 1, 1};
        assertEquals(4, solution1.findMaximizedCapital(2, 0, Profits, Capital));
    }
}
