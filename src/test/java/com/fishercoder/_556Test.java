package com.fishercoder;

import com.fishercoder.solutions._556;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class _556Test {
    private static _556 test;
    private static int n;
    private static int expected;
    private static int actual;

    @BeforeClass
    public static void setup(){
        test = new _556();
    }

    @Before
    public void setupForEachTest(){}

    @Test
    public void test1(){
        n = 12;
        expected = 21;
        actual = test.nextGreaterElement(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        n = 21;
        expected = -1;
        actual = test.nextGreaterElement(n);
        assertEquals(expected, actual);
        assertTrue(Integer.MAX_VALUE > 1999999999);
    }

    @Test
    public void test3(){
        n = 1999999999;
        expected = -1;
        actual = test.nextGreaterElement(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        n = 12222333;
        expected = 12223233;
        actual = test.nextGreaterElement(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        n = 12443322;
        expected = 13222344;
        actual = test.nextGreaterElement(n);
        assertEquals(expected, actual);
    }

}
