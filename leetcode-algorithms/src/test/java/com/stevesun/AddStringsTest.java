package com.stevesun;

import com.stevesun.solutions.AddBinary;
import com.stevesun.solutions.AddStrings;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevesun on 1/8/17.
 */
public class AddStringsTest {
    private static AddStrings test;
    private static String expected;
    private static String actual;
    private static String num1;
    private static String num2;

    @BeforeClass
    public static void setup() {
        test = new AddStrings();
        expected = new String();
        actual = new String();
        num1 = new String();
        num2 = new String();
    }

    @Before
    public void setupForEachTest() {
        expected = "";
        actual = "";
        num1 = "";
        num2 = "";
    }

    @Test
    public void test1() {

        num1 = "123";
        num2 = "34567";
        expected = "34690";
        actual = test.addStrings(num1, num2);
        assertEquals(expected, actual);

    }

    @Test
    public void test2() {

        num1 = "1";
        num2 = "9";
        expected = "10";
        actual = test.addStrings(num1, num2);
        assertEquals(expected, actual);

    }

    @Test
    public void test3() {

        num1 = "9";
        num2 = "99";
        expected = "108";
        actual = test.addStrings(num1, num2);
        assertEquals(expected, actual);

    }

}
