package com.fishercoder;

import com.fishercoder.solutions._541;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _541Test {
    private static _541.Solution1 solution1;
    private static String expected;
    private static String actual;
    private static String s;
    private static int k;

    @BeforeClass
    public static void setup() {
        solution1 = new _541.Solution1();
    }

    @Before
    public void setupForEachTest() {
    }

    @Test
    public void test1() {
        s = "abcd";
        k = 5;
        expected = "dcba";
        actual = solution1.reverseStr(s, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        s = "abcdefg";
        k = 2;
        expected = "bacdfeg";
        actual = solution1.reverseStr(s, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        s = "abcd";
        k = 4;
        expected = "dcba";
        actual = solution1.reverseStr(s, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        s = "abcdefg";
        k = 3;
        expected = "cbadefg";
        actual = solution1.reverseStr(s, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        s = "abcd";
        k = 3;
        expected = "cbad";
        actual = solution1.reverseStr(s, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        s = "hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl";
        System.out.println("s.length() = " + s.length());
        k = 39;
        expected = "fdcqkmxwholhytmhafpesaentdvxginrjlyqzyhehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqllgsqddebemjanqcqnfkjmi";
        actual = solution1.reverseStr(s, k);
        assertEquals(expected, actual);
    }

}
