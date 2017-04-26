package com.stevesun;

import com.stevesun.solutions.Sqrt;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevesun on 1/25/17.
 */
public class SqrtxTest {
    private static Sqrt test;
    private static int expected;
    private static int actual;
    private static int input;

    @BeforeClass
    public static void setup(){
        test = new Sqrt();
    }

    @Before
    public void setupForEachTest(){
        expected = 0;
        actual = 0;
        input = 0;
    }

    @Test
    public void test1(){
        expected = 4;
        input = 16;
        actual = test.mySqrt(input);
        assertEquals(expected, actual);

    }
}
