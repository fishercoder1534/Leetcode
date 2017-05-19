package com.stevesun;

import com.stevesun.solutions._439;
import com.stevesun.solutions._48;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 5/18/17.
 */
public class _439Test {
    private static _439 test;
    private static String expression;
    private static String expected;
    private static String actual;

    @BeforeClass
    public static void setup(){
        test = new _439();
    }

    @Test
    public void test1(){
        expression = "T?2:3";
        expected = "2";
        assertEquals(expected, test.parseTernary(expression));
    }

    @Test
    public void test2(){
        expression = "F?1:T?4:5";
        expected = "4";
        assertEquals(expected, test.parseTernary(expression));
    }

    @Test
    public void test3(){
        expression = "T?T?F:5:3";
        expected = "F";
        assertEquals(expected, test.parseTernary(expression));
    }

    @Test
    public void test4(){
        expression = "T?T:F?T?1:2:F?3:4";
        expected = "T";
        assertEquals(expected, test.parseTernary(expression));
    }
}
