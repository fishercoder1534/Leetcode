package com.fishercoder;

import com.fishercoder.solutions._69;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by fishercoder on 1/25/17.
 */
public class SqrtxTest {
    private static _69 test;
    private static int expected;
    private static int actual;
    private static int input;

    @BeforeClass
    public static void setup(){
        test = new _69();
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
