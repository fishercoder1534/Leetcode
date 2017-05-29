package com.fishercoder;

import com.fishercoder.solutions._504;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by fishercoder on 1/15/17.
 */
public class _504Test {
    private static _504 test;
    private static String expected;
    private static String actual;
    private static int num;

    @BeforeClass
    public static void setup(){
        test = new _504();
    }

    @Before
    public void setupForEachTest(){
        expected = "";
        actual = "";
        num = 0;
    }

    @Test
    public void test1(){
        num = 100;
        expected = "202";
        actual = test.convertToBase7(num);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        num = -7;
        expected = "-10";
        actual = test.convertToBase7(num);
        assertEquals(expected, actual);
    }
}
