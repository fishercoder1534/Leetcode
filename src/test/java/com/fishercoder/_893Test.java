package com.fishercoder;

import com.fishercoder.solutions._893;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _893Test {
    private static _893.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _893.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.numSpecialEquivGroups(new String[]{"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"}));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.numSpecialEquivGroups(new String[]{"abc", "acb", "bac", "bca", "cab", "cba"}));
    }

    @Test
    public void test3() {
        assertEquals(1, solution1.numSpecialEquivGroups(new String[]{"abcd", "cdab", "adcb", "cbad"}));
    }

}
