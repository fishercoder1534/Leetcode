package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._423;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _423Test {
    private _423.Solution1 solution1;
    private static String expected;
    private static String actual;
    private static String s;

    @BeforeEach
    public void setup() {
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
