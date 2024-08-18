package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._395;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _395Test {

    private _395.Solution1 solution1;
    private _395.Solution2 solution2;
    private static String s;
    private static int k;
    private static int expected;

    @BeforeEach
    public void setup() {
        solution1 = new _395.Solution1();
        solution2 = new _395.Solution2();
    }

    @Test
    public void test1() {
        s = "ababbc";
        expected = 5;
        k = 2;
        assertEquals(expected, solution1.longestSubstring(s, k));
        assertEquals(expected, solution2.longestSubstring(s, k));
    }

    @Test
    public void test2() {
        s = "aaabb";
        k = 3;
        expected = 3;
        assertEquals(expected, solution1.longestSubstring(s, k));
        assertEquals(expected, solution2.longestSubstring(s, k));
    }

    @Test
    public void test3() {
        s = "bbaaacbd";
        k = 3;
        expected = 3;
        assertEquals(expected, solution1.longestSubstring(s, k));
        assertEquals(expected, solution2.longestSubstring(s, k));
    }

    @Test
    public void test4() {
        s = "weitong";
        k = 2;
        expected = 0;
        assertEquals(expected, solution1.longestSubstring(s, k));
        assertEquals(expected, solution2.longestSubstring(s, k));
    }

    @Test
    public void test5() {
        s = "a";
        k = 2;
        expected = 0;
        assertEquals(expected, solution1.longestSubstring(s, k));
        assertEquals(expected, solution2.longestSubstring(s, k));
    }
}
