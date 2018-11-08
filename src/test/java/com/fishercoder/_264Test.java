package com.fishercoder;

import com.fishercoder.solutions._264;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _264Test {
    private static _264.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _264.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(12, solution1.nthUglyNumber(10));
    }

    @Test
    public void test2() {
        assertEquals(402653184, solution1.nthUglyNumber(1352));
    }
}
