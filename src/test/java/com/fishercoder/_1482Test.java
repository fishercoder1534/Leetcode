package com.fishercoder;

import com.fishercoder.solutions.secondthousand._1482;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1482Test {
    private static _1482.Solution1 solution1;
    private static int expected;
    private static int[] bloomDay;
    private static int m;
    private static int k;

    @BeforeClass
    public static void setup() {
        solution1 = new _1482.Solution1();
    }

    @Test
    public void test1() {
        expected = 3;
        bloomDay = new int[]{1, 10, 3, 10, 2};
        m = 3;
        k = 1;
        assertEquals(expected, solution1.minDays(bloomDay, m, k));
    }

    @Test
    public void test2() {
        expected = -1;
        bloomDay = new int[]{1, 10, 3, 10, 2};
        m = 3;
        k = 2;
        assertEquals(expected, solution1.minDays(bloomDay, m, k));
    }

    @Test
    public void test3() {
        expected = 9;
        bloomDay = new int[]{1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
        m = 4;
        k = 2;
        assertEquals(expected, solution1.minDays(bloomDay, m, k));
    }
}
