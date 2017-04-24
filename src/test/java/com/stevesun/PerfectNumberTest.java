package com.stevesun;

import com.stevesun.solutions.PerfectNumber;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevesun on 1/25/17.
 */
public class PerfectNumberTest {
    private static PerfectNumber test;
    private static boolean expected;
    private static boolean actual;
    private static int num;

    @BeforeClass
    public static void setup(){
        test = new PerfectNumber();
    }

    @Before
    public void setupForEachTest(){}

    @Test
    public void test1(){
        expected = true;
        num = 28;
        actual = test.checkPerfectNumber(num);
        assertEquals(expected, actual);
    }
}
