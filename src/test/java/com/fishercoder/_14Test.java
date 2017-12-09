package com.fishercoder;

import com.fishercoder.solutions._14;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _14Test {
    private static _14.Solution1 solution1;
    private static _14.Solution2 solution2;
    private static _14.Solution3 solution3;
    private static String[] strs;

    @BeforeClass
    public static void setup() {
        solution1 = new _14.Solution1();
        solution2 = new _14.Solution2();
        solution3 = new _14.Solution3();
    }

    @Test
    public void test1() {
        strs = new String[]{"a", "b"};
        assertEquals("", solution1.longestCommonPrefix(strs));
        assertEquals("", solution2.longestCommonPrefix(strs));
        assertEquals("", solution3.longestCommonPrefix(strs));
    }

    @Test
    public void test2() {
        strs = new String[]{"leetcode", "lead"};
        assertEquals("le", solution1.longestCommonPrefix(strs));
        assertEquals("le", solution2.longestCommonPrefix(strs));
        assertEquals("le", solution3.longestCommonPrefix(strs));
    }

    @Test
    public void test3() {
        strs = new String[]{"leetcode", "code"};
        assertEquals("", solution1.longestCommonPrefix(strs));
        assertEquals("", solution2.longestCommonPrefix(strs));
        assertEquals("", solution3.longestCommonPrefix(strs));
    }

}