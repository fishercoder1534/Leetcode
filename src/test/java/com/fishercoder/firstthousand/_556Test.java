package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fishercoder.solutions.firstthousand._556;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _556Test {
    private _556.Solution1 solution1;
    private static int n;
    private static int expected;
    private static int actual;

    @BeforeEach
    public void setup() {
        solution1 = new _556.Solution1();
    }

    @Test
    public void test1() {
        n = 12;
        expected = 21;
        actual = solution1.nextGreaterElement(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        n = 21;
        expected = -1;
        actual = solution1.nextGreaterElement(n);
        assertEquals(expected, actual);
        assertTrue(Integer.MAX_VALUE > 1999999999);
    }

    @Test
    public void test3() {
        n = 1999999999;
        expected = -1;
        actual = solution1.nextGreaterElement(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        n = 12222333;
        expected = 12223233;
        actual = solution1.nextGreaterElement(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        n = 12443322;
        expected = 13222344;
        actual = solution1.nextGreaterElement(n);
        assertEquals(expected, actual);
    }
}
