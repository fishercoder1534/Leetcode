package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._482;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _482Test {
    private _482.Solution1 solution1;
    private static String expected;
    private static String actual;
    private static String S;
    private static int k;

    @BeforeEach
    public void setup() {
        solution1 = new _482.Solution1();
    }

    @BeforeEach
    public void setupForEachTest() {
        expected = "";
        actual = "";
    }

    @Test
    public void test1() {
        S = "2-4A0r7-4k";
        k = 4;
        expected = "24A0-R74K";
        actual = solution1.licenseKeyFormatting(S, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        S = "2-4A0r7-4k";
        k = 3;
        expected = "24-A0R-74K";
        actual = solution1.licenseKeyFormatting(S, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        S = "--a-a-a-a--";
        k = 2;
        expected = "AA-AA";
        actual = solution1.licenseKeyFormatting(S, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        S = "---";
        k = 3;
        expected = "";
        actual = solution1.licenseKeyFormatting(S, k);
        assertEquals(expected, actual);
    }
}
