package com.fishercoder;

import com.fishercoder.solutions._1945;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1945Test {
    private static _1945.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1945.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(8, solution1.getLucky("zbax", 2));
    }

    @Test
    public void test2() {
        assertEquals(36, solution1.getLucky("iiii", 1));
    }

    @Test
    public void test3() {
        assertEquals(6, solution1.getLucky("leetcode", 2));
    }

    @Test
    public void test4() {
        assertEquals(8, solution1.getLucky("zbax", 2));
    }

    @Test
    public void test5() {
        assertEquals(8, solution1.getLucky("fleyctuuajsr", 5));
    }

}