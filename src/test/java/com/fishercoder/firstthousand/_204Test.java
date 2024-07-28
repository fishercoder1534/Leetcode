package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._204;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _204Test {
    private static _204.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _204.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.countPrimes(2));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.countPrimes(3));
    }

    @Test
    public void test3() {
        assertEquals(2, solution1.countPrimes(5));
    }

    @Test
    public void test4() {
        assertEquals(114155, solution1.countPrimes(1500000));
    }

    @Test
    public void test5() {
        assertEquals(10, solution1.countPrimes(30));
    }

    @Test
    public void test6() {
        assertEquals(4, solution1.countPrimes(10));
    }

    @Test
    public void test7() {
        assertEquals(8, solution1.countPrimes(20));
    }

    @Test
    public void test8() {
        assertEquals(12, solution1.countPrimes(40));
    }

    @Test
    public void test9() {
        assertEquals(15, solution1.countPrimes(50));
    }

}
