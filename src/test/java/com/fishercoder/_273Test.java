package com.fishercoder;

import com.fishercoder.solutions._273;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _273Test {
    private static _273.Solution1 solution1;
    private static int num;

    @BeforeClass
    public static void setup() {
        solution1 = new _273.Solution1();
    }

    @Test
    public void test1() {
        num = 123;
        assertEquals("One Hundred Twenty Three", solution1.numberToWords(num));
    }

    @Test
    public void test2() {
        num = 12345;
        assertEquals("Twelve Thousand Three Hundred Forty Five", solution1.numberToWords(num));
    }

    @Test
    public void test3() {
        num = 1234567;
        assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", solution1.numberToWords(num));
    }
}
