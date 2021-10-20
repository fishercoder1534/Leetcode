package com.fishercoder;

import com.fishercoder.solutions._76;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _76Test {
    private static _76.Solution1 solution1;
    private static _76.Solution2 solution2;
    private static String expected;
    private static String s;
    private static String t;

    @BeforeClass
    public static void setup() {
        solution1 = new _76.Solution1();
        solution2 = new _76.Solution2();
    }

    @Test
    public void test1() {
        expected = "BANC";
        s = "ADOBECODEBANC";
        t = "ABC";
        assertEquals(expected, solution1.minWindow(s, t));
        assertEquals(expected, solution2.minWindow(s, t));
    }

    @Test
    public void test2() {
        expected = "";
        s = "A";
        t = "B";
        assertEquals(expected, solution1.minWindow(s, t));
        assertEquals(expected, solution2.minWindow(s, t));
    }

    @Test
    public void test3() {
        expected = "cwae";
        s = "cabwefgewcwaefgcf";
        t = "cae";
        assertEquals(expected, solution1.minWindow(s, t));
        assertEquals(expected, solution2.minWindow(s, t));
    }
}
