package com.fishercoder;

import com.fishercoder.solutions._539;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class _539Test {
    private static _539.Soluiton1 soluiton1;
    private static int expected;
    private static int actual;
    private static List<String> timePoints;

    @BeforeClass
    public static void setup() {
        soluiton1 = new _539.Soluiton1();
    }

    @Before
    public void setupForEachTest() {
        expected = 0;
        actual = 0;
    }

    @Test
    public void test1() {
        timePoints = new ArrayList<>(Arrays.asList("23:59", "00:00"));
        expected = 1;
        actual = soluiton1.findMinDifference(timePoints);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        timePoints = new ArrayList<>(Arrays.asList("23:59", "00:00", "01:20"));
        expected = 1;
        actual = soluiton1.findMinDifference(timePoints);
        assertEquals(expected, actual);
    }

}
