package com.fishercoder;

import com.fishercoder.solutions._8;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _8Test {
    private static _8.Solution1 solution1;
    private static _8.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _8.Solution1();
        solution2 = new _8.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(2147483647, solution1.myAtoi("2147483648"));
        assertEquals(2147483647, solution2.myAtoi("2147483648"));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.myAtoi("+-2"));
        assertEquals(0, solution2.myAtoi("+-2"));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.myAtoi("+"));
        assertEquals(0, solution2.myAtoi("+"));
    }

    @Test
    public void test4() {
        assertEquals(0, solution1.myAtoi("abc"));
        assertEquals(0, solution2.myAtoi("abc"));
    }

    @Test
    public void test5() {
        assertEquals(1, solution1.myAtoi("1"));
        assertEquals(1, solution2.myAtoi("1"));
    }

    @Test
    public void test6() {
        assertEquals(-2147483648, solution1.myAtoi("-2147483648"));
        assertEquals(-2147483648, solution2.myAtoi("-2147483648"));
    }

    @Test
    public void test7() {
        assertEquals(0, solution1.myAtoi("++1"));
        assertEquals(0, solution2.myAtoi("++1"));
    }

    @Test
    public void test8() {
        assertEquals(-2147483648, solution1.myAtoi("-2147483649"));
        assertEquals(-2147483648, solution2.myAtoi("-2147483649"));
    }

    @Test
    public void test9() {
        assertEquals(2147483647, solution1.myAtoi("9223372036854775809"));
        assertEquals(2147483647, solution2.myAtoi("9223372036854775809"));
    }

}