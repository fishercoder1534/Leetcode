package com.fishercoder;

import com.fishercoder.solutions._224;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _224Test {
    private static _224.Solution1 solution1;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _224.Solution1();
    }

    @Test
    public void test1() {
        String s = "1 + 1";
        expected = 2;
        assertEquals(expected, solution1.calculate(s));
    }

    @Test
    public void test2() {
        String s = " 2-1 + 2 ";
        expected = 3;
        assertEquals(expected, solution1.calculate(s));
    }

    @Test
    public void test3() {
        String s = "(1+(4+5+2)-3)+(6+8)";
        expected = 23;
        assertEquals(expected, solution1.calculate(s));
    }

    @Test
    public void test4() {
        String s = "1-(-2)";
        expected = 3;
        assertEquals(expected, solution1.calculate(s));
    }

}
