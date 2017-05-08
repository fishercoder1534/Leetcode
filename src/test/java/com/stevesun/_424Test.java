package com.stevesun;

import com.stevesun.solutions._424;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 5/7/17.
 */
public class _424Test {
    private static _424 test;
    private static String s;
    private static int k;
    private static int actual;
    private static int expected;

    @BeforeClass
    public static void setup(){
        test = new _424();
    }

    @Test
    public void test1(){
        s = "ABAB";
        k = 2;
        actual = test.characterReplacement(s, k);
        expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "AABABBA";
        k = 1;
        actual = test.characterReplacement(s, k);
        expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        s = "AAAA";
        k = 2;
        actual = test.characterReplacement(s, k);
        expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        s = "AAAB";
        k = 0;
        actual = test.characterReplacement(s, k);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        s = "AABA";
        k = 0;
        actual = test.characterReplacement(s, k);
        expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void test6(){
        s = "ABBB";
        k = 2;
        actual = test.characterReplacement(s, k);
        expected = 4;
        assertEquals(expected, actual);
    }
}
