package com.fishercoder;

import com.fishercoder.solutions._14;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _14Test {
    private static _14.Solution1 solution1;
    private static String[] strs;

    @BeforeClass
    public static void setup() {
        solution1 = new _14.Solution1();
    }

    @Test
    public void test1() {
        strs = new String[]{"a", "b"};
        assertEquals("", solution1.longestCommonPrefix(strs));
    }

}