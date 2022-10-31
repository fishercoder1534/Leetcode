package com.fishercoder;

import com.fishercoder.solutions._43;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _43Test {
    private static _43.Solution1 solution1;
    private static _43.Solution2 solution2;
    private static String expected;
    private static String num1;
    private static String num2;

    @BeforeClass
    public static void setup() {
        solution1 = new _43.Solution1();
        solution2 = new _43.Solution2();
    }

    @Test
    public void test1() {
        num1 = "123";
        num2 = "45";
        expected = "5535";
        assertEquals(expected, solution1.multiply(num1, num2));
        assertEquals(expected, solution2.multiply(num1, num2));
    }

    @Test
    public void test2() {
        num1 = "9133";
        num2 = "0";
        expected = "0";
        assertEquals(expected, solution1.multiply(num1, num2));
        assertEquals(expected, solution2.multiply(num1, num2));
    }

    @Test
    public void test3() {
        num1 = "6913259244";
        num2 = "71103343";
        expected = "491555843274052692";
        assertEquals(expected, solution1.multiply(num1, num2));
        assertEquals(expected, solution2.multiply(num1, num2));
    }

    @Test
    public void test4() {
        num1 = "401716832807512840963";
        num2 = "167141802233061013023557397451289113296441069";
        expected = "67143675422804947379429215144664313370120390398055713625298709447";
        assertEquals(expected, solution1.multiply(num1, num2));
        assertEquals(expected, solution2.multiply(num1, num2));
    }
}
