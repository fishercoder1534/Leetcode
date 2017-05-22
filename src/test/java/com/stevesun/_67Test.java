package com.stevesun;

import com.stevesun.solutions._67;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by stevesun on 1/8/17.
 */
public class _67Test {
    private static _67 test;
    private static String expected;
    private static String actual;
    private static String a;
    private static String b;

    @BeforeClass
    public static void setup(){
        test = new _67();
        expected = new String();
        actual = new String();
        a = new String();
        b = new String();
    }

    @Before
    public void setupForEachTest(){
        expected = "";
        actual = "";
        a = "";
        b = "";
    }

    @Test
    public void test1(){

        a = "0";
        b = "0";
        expected = "0";
        actual = test.addBinary(a, b);
        assertEquals(expected, actual);

    }

    @Test
    public void test2(){

        a = "11";
        b = "1";
        expected = "100";
        actual = test.addBinary(a, b);
        assertEquals(expected, actual);

    }

    @Test
    public void test3(){

        a = "100";
        b = "110010";
        expected = "110110";
        actual = test.addBinary(a, b);
        assertEquals(expected, actual);

    }

    @Test
    public void test4(){

        a = "101111";
        b = "10";
        expected = "110001";
        actual = test.addBinary(a, b);
        assertEquals(expected, actual);

    }
}
