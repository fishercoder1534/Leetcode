package com.fishercoder;

import com.fishercoder.solutions._415;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _415Test {
    private static _415.Solution1 solution1;
    private static String expected;
    private static String actual;
    private static String num1;
    private static String num2;

    @BeforeClass
    public static void setup() {
        solution1 = new _415.Solution1();
        expected = new String();
        actual = new String();
        num1 = new String();
        num2 = new String();
    }

    @Test
    public void test1() {
        num1 = "123";
        num2 = "34567";
        expected = "34690";
        actual = solution1.addStrings(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        num1 = "1";
        num2 = "9";
        expected = "10";
        actual = solution1.addStrings(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        num1 = "9";
        num2 = "99";
        expected = "108";
        actual = solution1.addStrings(num1, num2);
        assertEquals(expected, actual);
    }

}
