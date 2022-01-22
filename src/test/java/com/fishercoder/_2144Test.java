package com.fishercoder;

import com.fishercoder.solutions._2144;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2144Test {
    private static _2144.Solution1 solution1;
    private static int[] cost;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _2144.Solution1();
    }

    @Test
    public void test1() {
        expected = 5;
        cost = new int[]{1, 2, 3};
        assertEquals(expected, solution1.minimumCost(cost));
    }

    @Test
    public void test2() {
        expected = 23;
        cost = new int[]{6, 5, 7, 9, 2, 2};
        assertEquals(expected, solution1.minimumCost(cost));
    }

    @Test
    public void test3() {
        expected = 10;
        cost = new int[]{5, 5};
        assertEquals(expected, solution1.minimumCost(cost));
    }

}
