package com.fishercoder;

import com.fishercoder.solutions._424;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _424Test {
    private static _424.Solution1 solution1;
    private static _424.Solution2 solution2;
    private static String s;
    private static int k;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _424.Solution1();
        solution2 = new _424.Solution2();
    }

    @Test
    public void test1() {
        s = "ABAB";
        k = 2;
        expected = 4;
        assertEquals(expected, solution1.characterReplacement(s, k));
        assertEquals(expected, solution2.characterReplacement(s, k));
    }

    @Test
    public void test2() {
        s = "AABABBA";
        k = 1;
        expected = 4;
        assertEquals(expected, solution1.characterReplacement(s, k));
    }

    @Test
    public void test3() {
        s = "AAAA";
        k = 2;
        expected = 4;
        assertEquals(expected, solution1.characterReplacement(s, k));
    }

    @Test
    public void test4() {
        s = "AAAB";
        k = 0;
        expected = 3;
        assertEquals(expected, solution1.characterReplacement(s, k));
    }

    @Test
    public void test5() {
        s = "AABA";
        k = 0;
        expected = 2;
        assertEquals(expected, solution1.characterReplacement(s, k));
    }

    @Test
    public void test6() {
        s = "ABBB";
        k = 2;
        expected = 4;
        assertEquals(expected, solution1.characterReplacement(s, k));
    }
}
