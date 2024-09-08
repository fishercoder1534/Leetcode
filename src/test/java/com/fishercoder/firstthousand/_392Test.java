package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._392;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _392Test {
    private _392.Solution1 solution1;
    private static String s;
    private static String t;
    private static boolean expected;
    private static boolean actual;

    @BeforeEach
    public void setUp() {
        solution1 = new _392.Solution1();
    }

    @Test
    public void test1() {
        s = "abc";
        t = "ahbgdc";
        expected = true;
        actual = solution1.isSubsequence(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        s = "axc";
        t = "ahbgdc";
        expected = false;
        actual = solution1.isSubsequence(s, t);
        assertEquals(expected, actual);
    }
}
