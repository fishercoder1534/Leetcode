package com.fishercoder;

import com.fishercoder.solutions._1400;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1400Test {
    private static _1400.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1400.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.canConstruct("annabelle", 2));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.canConstruct("leetcode", 3));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.canConstruct("true", 4));
    }

    @Test
    public void test4() {
        assertEquals(true, solution1.canConstruct("yzyzyzyzyzyzyzy", 2));
    }

    @Test
    public void test5() {
        assertEquals(false, solution1.canConstruct("cr", 7));
    }

    @Test
    public void test6() {
        assertEquals(true, solution1.canConstruct("qlkzenwmmnpkopu", 15));
    }

    @Test
    public void test7() {
        assertEquals(true, solution1.canConstruct("jsautfnlcmwqpzycehdulmdencthhlzsnijd", 35));
    }

}