package com.fishercoder;

import com.fishercoder.solutions._10;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _10Test {
    private static _10.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _10.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isMatch("", ""));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.isMatch("aa", "a"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.isMatch("aab", "c*a*b"));
    }

}