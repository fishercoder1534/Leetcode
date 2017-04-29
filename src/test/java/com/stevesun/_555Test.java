package com.stevesun;

import com.stevesun.solutions._555;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevesun on 4/29/17.
 */
public class _555Test {
    private static _555 test;
    private static String expected;
    private static String actual;
    private static String[] strs;

    @BeforeClass
    public static void setup(){
        test = new _555();
    }

    @Test
    public void test1(){
        strs = new String[]{"abc", "xyz"};
        expected = "zyxcba";
        actual = test.splitLoopedString(strs);
        assertEquals(expected, actual);
    }
}
