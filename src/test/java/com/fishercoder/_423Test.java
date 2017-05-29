package com.fishercoder;

import com.fishercoder.solutions._423;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by fishercoder on 4/27/17.
 */
public class _423Test {
    private static _423 test;
    private static String expected;
    private static String actual;
    private static String s;

    @BeforeClass
    public static void setup(){
        test = new _423();
    }

    @Test
    public void test1(){
        s = "fviefuro";
        expected = "45";
        actual = test.originalDigits(s);
        assertEquals(expected, actual);
    }
}
