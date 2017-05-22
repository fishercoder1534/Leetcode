package com.stevesun;

import com.stevesun.solutions._273;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 5/13/17.
 */
public class _273Test {
    private static _273 test;
    private static int num;

    @BeforeClass
    public static void setup(){
        test = new _273();
    }

    @Test
    public void test1(){
        num = 123;
        assertEquals("One Hundred Twenty Three", test.numberToWords(num));
    }

    @Test
    public void test2(){
        num = 12345;
        assertEquals("Twelve Thousand Three Hundred Forty Five", test.numberToWords(num));
    }

    @Test
    public void test3(){
        num = 1234567;
        assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", test.numberToWords(num));
    }
}
