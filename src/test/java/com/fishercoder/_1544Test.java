package com.fishercoder;

import com.fishercoder.solutions._1544;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1544Test {
    private static _1544.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1544.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("leetcode", solution1.makeGood("leEeetcode"));
    }

    @Test
    public void test2() {
        assertEquals("", solution1.makeGood("abBAcC"));
    }

    @Test
    public void test3() {
        assertEquals("s", solution1.makeGood("s"));
    }

}