package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._424;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _424Test {
    private _424.Solution1 solution1;
    private _424.Solution2 solution2;
    private static String s;
    private static int k;
    private static int expected;

    @BeforeEach
    public void setup() {
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
