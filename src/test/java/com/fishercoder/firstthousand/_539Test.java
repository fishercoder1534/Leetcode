package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._539;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _539Test {
    private _539.Soluiton1 soluiton1;
    private static int expected;
    private static int actual;
    private static List<String> timePoints;

    @BeforeEach
    public void setup() {
        soluiton1 = new _539.Soluiton1();
    }

    @BeforeEach
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
