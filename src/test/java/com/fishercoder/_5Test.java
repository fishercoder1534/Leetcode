package com.fishercoder;

import com.fishercoder.solutions._5;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _5Test {
    private static _5.Solution1 solution1;
    private static _5.Solution2 solution2;
    private static String s;

    @BeforeClass
    public static void setup() {
        solution1 = new _5.Solution1();
        solution2 = new _5.Solution2();
    }

    @Test
    public void test1() {
        s = "babad";
        assertEquals("bab", solution1.longestPalindrome(s));
        assertEquals("aba", solution2.longestPalindrome(s));
    }

}