package com.fishercoder;

import com.fishercoder.solutions._201;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/3/17.
 */
public class _201Test {
    private static _201.Solution1 solution1;
    private static int m;
    private static int n;
    private static int actual;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _201.Solution1();
    }

    @Test
    public void test1() {
        m = 5;
        n = 7;
        actual = solution1.rangeBitwiseAnd(m, n);
        expected = 4;
        assertEquals(expected, actual);
        actual = solution1.rangeBitwiseAnd(m, n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        m = 1;
        n = 2;
        actual = solution1.rangeBitwiseAnd(m, n);
        expected = 0;
        assertEquals(expected, actual);
        actual = solution1.rangeBitwiseAnd(m, n);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        m = 0;
        n = 2147483647;
        actual = solution1.rangeBitwiseAnd(m, n);
        expected = 0;
        assertEquals(expected, actual);
        actual = solution1.rangeBitwiseAnd(m, n);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        m = 20000;
        n = 2147483647;
        actual = solution1.rangeBitwiseAnd(m, n);
        expected = 0;
        assertEquals(expected, actual);
        actual = solution1.rangeBitwiseAnd(m, n);
        assertEquals(expected, actual);
    }
}
