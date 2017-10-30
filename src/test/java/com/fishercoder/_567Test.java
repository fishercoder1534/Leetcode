package com.fishercoder;

import com.fishercoder.solutions._567;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _567Test {
    private static _567.Solution1 solution1;
    private static boolean expected;
    private static boolean actual;
    private static String s1;
    private static String s2;

    @BeforeClass
    public static void setup() {
        solution1 = new _567.Solution1();
    }

    @Test
    public void test1() {
        s1 = "ab";
        s2 = "eidbaooo";
        expected = true;
        actual = solution1.checkInclusion(s1, s2);
        assertEquals(expected, actual);
    }
}
