package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._567;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _567Test {
    private _567.Solution1 solution1;
    private _567.Solution2 solution2;
    private static boolean expected;
    private static boolean actual;
    private static String s1;
    private static String s2;

    @BeforeEach
    public void setup() {
        solution1 = new _567.Solution1();
        solution2 = new _567.Solution2();
    }

    @Test
    public void test1() {
        s1 = "ab";
        s2 = "eidbaooo";
        expected = true;
        actual = solution1.checkInclusion(s1, s2);
        actual = solution2.checkInclusion(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        s1 = "adc";
        s2 = "dcda";
        expected = true;
        actual = solution1.checkInclusion(s1, s2);
        actual = solution2.checkInclusion(s1, s2);
        assertEquals(expected, actual);
    }
}
