package com.fishercoder;

import com.fishercoder.solutions._2413;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2413Test {
    private static _2413.Solution1 solution1;
    private static int n;

    @BeforeClass
    public static void setup() {
        solution1 = new _2413.Solution1();
    }

    @Test
    public void test1() {
        n = 99;
        int actual = solution1.smallestEvenMultiple(n);
        int expected = 198;
        assertEquals(actual, expected);
    }
}
