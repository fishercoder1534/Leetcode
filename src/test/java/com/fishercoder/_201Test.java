package com.fishercoder;

import com.fishercoder.solutions._201;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _201Test {
    private static _201.Solution1 solution1;
    private static int left;
    private static int right;
    private static int actual;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _201.Solution1();
    }

    @Test
    public void test1() {
        left = 5;
        right = 7;
        actual = solution1.rangeBitwiseAnd(left, right);
        expected = 4;
        assertEquals(expected, actual);
        actual = solution1.rangeBitwiseAnd(left, right);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        left = 1;
        right = 2;
        actual = solution1.rangeBitwiseAnd(left, right);
        expected = 0;
        assertEquals(expected, actual);
        actual = solution1.rangeBitwiseAnd(left, right);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        left = 0;
        right = 2147483647;
        actual = solution1.rangeBitwiseAnd(left, right);
        expected = 0;
        assertEquals(expected, actual);
        actual = solution1.rangeBitwiseAnd(left, right);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        left = 20000;
        right = 2147483647;
        actual = solution1.rangeBitwiseAnd(left, right);
        expected = 0;
        assertEquals(expected, actual);
        actual = solution1.rangeBitwiseAnd(left, right);
        assertEquals(expected, actual);
    }
}
