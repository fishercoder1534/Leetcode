package com.fishercoder;

import com.fishercoder.solutions.firstthousand._509;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _509Test {
    private static _509.Solution1 solution1;
    private static _509.Solution2 solution2;
    private static _509.Solution3 solution3;

    @BeforeEach
    public void setup() {
        solution1 = new _509.Solution1();
        solution2 = new _509.Solution2();
        solution3 = new _509.Solution3();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.fib(2));
        assertEquals(1, solution2.fib(2));
        assertEquals(1, solution3.fib(2));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.fib(3));
        assertEquals(2, solution2.fib(3));
        assertEquals(2, solution3.fib(3));
    }

    @Test
    public void test3() {
        assertEquals(3, solution1.fib(4));
        assertEquals(3, solution2.fib(4));
        assertEquals(3, solution3.fib(4));
    }

    @Test
    public void test4() {
        assertEquals(0, solution1.fib(0));
        assertEquals(0, solution2.fib(0));
        assertEquals(0, solution3.fib(0));
    }
}
