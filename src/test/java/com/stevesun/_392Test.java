package com.stevesun;

import com.stevesun.solutions._392;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevesun on 5/7/17.
 */
public class _392Test {
    private static _392 test;
    private static String s;
    private static String t;
    private static boolean expected;
    private static boolean actual;

    @BeforeClass
    public static void setup(){
        test = new _392();
    }

    @Test
    public void test1(){
        s = "abc";
        t = "ahbgdc";
        expected = true;
        actual = test.isSubsequence(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "axc";
        t = "ahbgdc";
        expected = false;
        actual = test.isSubsequence(s, t);
        assertEquals(expected, actual);
    }
}
