package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._14;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _14Test {
    private _14.Solution1 solution1;
    private _14.Solution2 solution2;
    private static String[] strs;

    @BeforeEach
    public void setup() {
        solution1 = new _14.Solution1();
        solution2 = new _14.Solution2();
    }

    @Test
    public void test1() {
        strs = new String[] {"a", "b"};
        assertEquals("", solution1.longestCommonPrefix(strs));
        assertEquals("", solution2.longestCommonPrefix(strs));
    }

    @Test
    public void test2() {
        strs = new String[] {"leetcode", "lead"};
        assertEquals("le", solution1.longestCommonPrefix(strs));
        assertEquals("le", solution2.longestCommonPrefix(strs));
    }

    @Test
    public void test3() {
        strs = new String[] {"leetcode", "code"};
        assertEquals("", solution1.longestCommonPrefix(strs));
        assertEquals("", solution2.longestCommonPrefix(strs));
    }

    @Test
    public void test4() {
        strs = new String[] {"flower", "flow", "flight"};
        assertEquals("fl", solution1.longestCommonPrefix(strs));
        assertEquals("fl", solution2.longestCommonPrefix(strs));
    }

    @Test
    public void test5() {
        strs = new String[] {};
        assertEquals("", solution1.longestCommonPrefix(strs));
        assertEquals("", solution2.longestCommonPrefix(strs));
    }

    @Test
    public void test6() {
        strs = new String[] {"a"};
        assertEquals("a", solution1.longestCommonPrefix(strs));
        assertEquals("a", solution2.longestCommonPrefix(strs));
    }

    @Test
    public void test7() {
        strs = new String[] {"c", "c"};
        assertEquals("c", solution1.longestCommonPrefix(strs));
        assertEquals("c", solution2.longestCommonPrefix(strs));
    }
}
