package com.fishercoder;

import com.fishercoder.solutions._1137;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1137Test {
    private static _1137.Solution1 solution1;

    @BeforeClass
    public static void setup() {
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
