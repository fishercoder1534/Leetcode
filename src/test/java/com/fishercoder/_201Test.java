package com.fishercoder;

import com.fishercoder.solutions._201;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/3/17.
 */
public class _201Test {
    private static _201 test;
    private static int m;
    private static int n;
    private static int actual;
    private static int expected;

    @BeforeClass
    public static void setup(){
        test = new _201();
    }

    @Test
    public void test1(){
        m = 5;
        n = 7;
        actual = test.rangeBitwiseAnd_TLE(m, n);
        expected = 4;
        assertEquals(expected, actual);
        actual = test.rangeBitwiseAnd(m, n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        m = 1;
        n = 2;
        actual = test.rangeBitwiseAnd_TLE(m, n);
        expected = 0;
        assertEquals(expected, actual);
        actual = test.rangeBitwiseAnd(m, n);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        m = 0;
        n = 2147483647;
        long start = System.currentTimeMillis();
        actual = test.rangeBitwiseAnd_TLE(m, n);
        System.out.println("It took " + (System.currentTimeMillis() - start) + " ms to finish.");
        expected = 0;
        assertEquals(expected, actual);
        actual = test.rangeBitwiseAnd(m, n);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        m = 20000;
        n = 2147483647;
        long start = System.currentTimeMillis();
//        actual = test.rangeBitwiseAnd_TLE(m, n);
        System.out.println("It took " + (System.currentTimeMillis() - start) + " ms to finish.");
        expected = 0;
        assertEquals(expected, actual);
        actual = test.rangeBitwiseAnd(m, n);
        assertEquals(expected, actual);
    }
}
