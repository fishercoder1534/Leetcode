package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._434;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _434Test {
    private _434.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static String s;

    @BeforeEach
    public void setUp() {
        solution1 = new _434.Solution1();
    }

    @BeforeEach
    public void setupForEachTest() {
        expected = 0;
        actual = 0;
    }

    @Test
    public void test1() {
        s = "Hello, my name is John";
        expected = 5;
        actual = solution1.countSegments(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        s = ", , , ,        a, eaefa";
        expected = 6;
        actual = solution1.countSegments(s);
        assertEquals(expected, actual);
    }
}
