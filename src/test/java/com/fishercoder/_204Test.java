package com.fishercoder;

import com.fishercoder.solutions._204;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _204Test {
    private static _204.Solution1 solution1;
    private static _204.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _204.Solution1();
        solution2 = new _204.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.countPrimes(2));
        assertEquals(0, solution2.countPrimes(2));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.countPrimes(3));
        assertEquals(1, solution2.countPrimes(3));
    }

    @Test
    public void test3() {
        assertEquals(2, solution1.countPrimes(5));
        assertEquals(2, solution2.countPrimes(5));
    }

    @Test
    public void test4() {
        assertEquals(114155, solution1.countPrimes(1500000));
        assertEquals(114155, solution2.countPrimes(1500000));
    }

}
