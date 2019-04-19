package com.fishercoder;

import com.fishercoder.solutions._458;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _458Test {
    private static _458.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static int buckets;
    private static int minutesToDie;
    private static int minutesToTest;

    @BeforeClass
    public static void setup() {
        solution1 = new _458.Solution1();
    }

    @Before
    public void setupForEachTest() {
        expected = 0;
        actual = 0;
    }

    @Test
    public void test1() {
        buckets = 1000;
        minutesToDie = 15;
        minutesToTest = 60;
        expected = 5;
        actual = solution1.poorPigs(buckets, minutesToDie, minutesToTest);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        buckets = 1;
        minutesToDie = 1;
        minutesToTest = 1;
        expected = 0;
        actual = solution1.poorPigs(buckets, minutesToDie, minutesToTest);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        buckets = 1000;
        minutesToDie = 12;
        minutesToTest = 60;
        expected = 4;
        actual = solution1.poorPigs(buckets, minutesToDie, minutesToTest);
        assertEquals(expected, actual);
    }
}
