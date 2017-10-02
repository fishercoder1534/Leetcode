package com.fishercoder;

import com.fishercoder.solutions._688;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class _688Test {
    private static _688.Solution1 solution1;
    private static _688.Solution2 solution2;

    @Before
    public void setupForEachTest() {
        solution1 = new _688.Solution1();
        solution2 = new _688.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(0.0625, solution1.knightProbability(3, 2, 0, 0));
        assertEquals(0.0625, solution2.knightProbability(3, 2, 0, 0));
    }

    @Test
    public void test2() {
        assertTrue(Math.abs(0.00019 - solution2.knightProbability(8, 30, 6, 4)) < 10e-7);
    }
}
