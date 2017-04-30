package com.stevesun;

import com.stevesun.solutions._567;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 4/30/17.
 */
public class _567Test {
    private static _567 test;
    private static boolean expected;
    private static boolean actual;
    private static String s1;
    private static String s2;

    @BeforeClass
    public static void setup(){
        test = new _567();
    }

    @Test
    public void test1(){
        s1 = "ab";
        s2 = "eidbaooo";
        expected = true;
        actual = test.checkInclusion(s1, s2);
        assertEquals(expected, actual);
    }
}
