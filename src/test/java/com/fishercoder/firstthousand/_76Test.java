package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._76;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _76Test {
    private _76.Solution1 solution1;
    private _76.Solution2 solution2;
    private static String expected;
    private static String s;
    private static String t;

    @BeforeEach
    public void setup() {
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
