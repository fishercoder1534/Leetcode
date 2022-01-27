package com.fishercoder;

import com.fishercoder.solutions._1891;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1891Test {
    private static _1891.Solution1 solution1;
    private static int[] ribbons;
    private static int k;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _1891.Solution1();
    }

    @Test
    public void test1() {
        ribbons = new int[]{9, 7, 5};
        k = 3;
        expected = 5;
        assertEquals(expected, solution1.maxLength(ribbons, k));
    }

    @Test
    public void test2() {
        ribbons = new int[]{7, 5, 9};
        k = 4;
        expected = 4;
        assertEquals(expected, solution1.maxLength(ribbons, k));
    }

    @Test
    public void test3() {
        ribbons = new int[]{5, 7, 9};
        k = 22;
        expected = 0;
        assertEquals(expected, solution1.maxLength(ribbons, k));
    }

    @Test
    public void test4() {
        ribbons = new int[]{100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 1, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000};
        k = 49;
        expected = 100000;
        assertEquals(expected, solution1.maxLength(ribbons, k));
    }


}
