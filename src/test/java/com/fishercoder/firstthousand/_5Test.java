package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._5;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _5Test {
    private _5.Solution1 solution1;
    private _5.Solution2 solution2;
    private _5.Solution3 solution3;
    private static String s;

    @BeforeEach
    public void setup() {
        solution1 = new _5.Solution1();
        solution2 = new _5.Solution2();
        solution3 = new _5.Solution3();
    }

    @Test
    public void test1() {
        s = "babad";
        assertEquals("bab", solution1.longestPalindrome(s));
        assertEquals("aba", solution2.longestPalindrome(s));
        assertEquals("bab", solution3.longestPalindrome(s));
    }
}
