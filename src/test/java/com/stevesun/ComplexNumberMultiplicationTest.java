package com.stevesun;

import com.stevesun.solutions.ComplexNumberMultiplication;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevesun on 1/25/17.
 */
public class ComplexNumberMultiplicationTest {
    private static ComplexNumberMultiplication test;
    private static String expected;
    private static String actual;
    private static String a;
    private static String b;

    @BeforeClass
    public static void setup(){
        test = new ComplexNumberMultiplication();
    }

    @Before
    public void setupForEachTest(){}

    @Test
    public void test1(){
        expected = "0+2i";
        a = "1+1i";
        b = "1+1i";
        actual = test.complexNumberMultiply(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        expected = "0+-2i";
        a = "1+-1i";
        b = "1+-1i";
        actual = test.complexNumberMultiply(a, b);
        assertEquals(expected, actual);
    }
}
