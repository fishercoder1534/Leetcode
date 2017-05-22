package com.stevesun;

import com.stevesun.solutions._495;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 5/8/17.
 */
public class _495Test {
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
        _495 test = new _495();
        timeSeries = new int[]{1,4};
        duration = 2;
        actual = test.findPoisonedDuration(timeSeries, duration);
        expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        _495 test = new _495();
        timeSeries = new int[]{1,2};
        duration = 2;
        actual = test.findPoisonedDuration(timeSeries, duration);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        _495 test = new _495();
        timeSeries = new int[]{};
        duration = 100000;
        actual = test.findPoisonedDuration(timeSeries, duration);
        expected = 0;
        assertEquals(expected, actual);
    }
}
