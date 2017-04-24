package com.stevesun;

import com.stevesun.solutions.Base7;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevesun on 1/15/17.
 */
public class Base7Test {
    private static Base7 test;
    private static String expected;
    private static String actual;
    private static int num;

    @BeforeClass
    public static void setup(){
        test = new Base7();
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
