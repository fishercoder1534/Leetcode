package com.fishercoder;

import com.fishercoder.solutions._507;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by fishercoder on 1/25/17.
 */
public class _507Test {
    private static _507 test;
    private static boolean expected;
    private static boolean actual;
    private static int num;

    @BeforeClass
    public static void setup(){
        test = new _507();
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
