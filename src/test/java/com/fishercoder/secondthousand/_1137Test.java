package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1137;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1137Test {
    private _1137.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1137.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.tribonacci(3));
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.tribonacci(4));
    }

    @Test
    public void test3() {
        assertEquals(1389537, solution1.tribonacci(25));
    }

    @Test
    public void test4() {
        assertEquals(0, solution1.tribonacci(0));
    }

    @Test
    public void test5() {
        assertEquals(1, solution1.tribonacci(2));
    }
}
