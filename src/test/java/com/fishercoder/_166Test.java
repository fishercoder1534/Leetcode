package com.fishercoder;

import com.fishercoder.solutions._166;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/28/17.
 */
public class _166Test {
    private static _166 test;

    @BeforeClass
    public static void setup(){
        test = new _166();
    }

    @Test
    public void test1(){
        assertEquals("0.5", test.fractionToDecimal(1, 2));
    }

    @Test
    public void test2(){
        assertEquals("2", test.fractionToDecimal(2, 1));
    }

    @Test
    public void test3(){
        assertEquals("0.(6)", test.fractionToDecimal(2, 3));
    }

    @Test
    public void test4(){
        assertEquals("-6.25", test.fractionToDecimal(-50, 8));
    }

    @Test
    public void test5(){
        assertEquals("-0.58(3)", test.fractionToDecimal(7, -12));
    }

    @Test
    public void test6(){
        assertEquals("0.0000000004656612873077392578125", test.fractionToDecimal(-1, -2147483648));
    }

    @Test
    public void test7(){
        assertEquals("0", test.fractionToDecimal(0, -5));
    }

    @Test
    public void test8(){
        assertEquals("-2147483648", test.fractionToDecimal(-2147483648, 1));
    }
}
