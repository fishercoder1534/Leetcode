package com.fishercoder;

import com.fishercoder.solutions._495;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/8/17.
 */
public class _495Test {
    _495.Solution1 solution1 = new _495.Solution1();
    private static int actual = 0;
    private static int expected = 0;
    private static int[] timeSeries;
    private static int duration = 0;

    @Before
    public void setup() {
        timeSeries = new int[]{};
        duration = 0;
        expected = 0;
        actual = 0;
    }

    @Test
    public void test1() {
        timeSeries = new int[]{1, 4};
        duration = 2;
        actual = solution1.findPoisonedDuration(timeSeries, duration);
        expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        timeSeries = new int[]{1, 2};
        duration = 2;
        actual = solution1.findPoisonedDuration(timeSeries, duration);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        timeSeries = new int[]{};
        duration = 100000;
        actual = solution1.findPoisonedDuration(timeSeries, duration);
        expected = 0;
        assertEquals(expected, actual);
    }
}
