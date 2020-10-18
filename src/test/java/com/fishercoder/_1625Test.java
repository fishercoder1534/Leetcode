package com.fishercoder;

import com.fishercoder.solutions._1625;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1625Test {
    private static _1625.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1625.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("2050", solution1.findLexSmallestString("5525", 9, 2));
    }

    @Test
    public void test2() {
        assertEquals("24", solution1.findLexSmallestString("74", 5, 1));
    }

    @Test
    public void test3() {
        assertEquals("0011", solution1.findLexSmallestString("0011", 4, 2));
    }

    @Test
    public void test4() {
        assertEquals("00553311", solution1.findLexSmallestString("43987654", 7, 3));
    }

}