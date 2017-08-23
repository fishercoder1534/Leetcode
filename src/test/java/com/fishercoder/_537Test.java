package com.fishercoder;

import com.fishercoder.solutions._537;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by fishercoder on 1/25/17.
 */
public class _537Test {
    private static _537 test;
    private static String expected;
    private static String actual;
    private static String a;
    private static String b;

    @BeforeClass
    public static void setup() {
        test = new _537();
    }

    @Before
    public void setupForEachTest() {
    }

    @Test
    public void test1() {
        expected = "0+2i";
        a = "1+1i";
        b = "1+1i";
        actual = test.complexNumberMultiply(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        expected = "0+-2i";
        a = "1+-1i";
        b = "1+-1i";
        actual = test.complexNumberMultiply(a, b);
        assertEquals(expected, actual);
    }
}
