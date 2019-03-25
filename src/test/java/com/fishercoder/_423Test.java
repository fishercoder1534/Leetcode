package com.fishercoder;

import com.fishercoder.solutions._423;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _423Test {
    private static _423.Solution1 solution1;
    private static String expected;
    private static String actual;
    private static String s;

    @BeforeClass
    public static void setup() {
        solution1 = new _423.Solution1();
    }

    @Test
    public void test1() {
        s = "fviefuro";
        expected = "45";
        actual = solution1.originalDigits(s);
        assertEquals(expected, actual);
    }
}
