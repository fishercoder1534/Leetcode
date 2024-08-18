package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._264;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _264Test {
    private _264.Solution1 solution1;
    private _264.Solution2 solution2;
    private _264.Solution3 solution3;

    @BeforeEach
    public void setup() {
        solution1 = new _264.Solution1();
        solution2 = new _264.Solution2();
        solution3 = new _264.Solution3();
    }

    @Test
    public void test1() {
        assertEquals(12, solution1.nthUglyNumber(10));
        assertEquals(12, solution2.nthUglyNumber(10));
        assertEquals(12, solution3.nthUglyNumber(10));
    }

    @Test
    public void test2() {
        assertEquals(402653184, solution1.nthUglyNumber(1352));
        assertEquals(402653184, solution2.nthUglyNumber(1352));
    }

    @Test
    public void test3() {
        assertEquals(1, solution1.nthUglyNumber(1));
        assertEquals(1, solution2.nthUglyNumber(1));
    }

    @Test
    public void test4() {
        assertEquals(2, solution1.nthUglyNumber(2));
        assertEquals(2, solution2.nthUglyNumber(2));
    }

    @Test
    public void test5() {
        assertEquals(3, solution1.nthUglyNumber(3));
        assertEquals(3, solution2.nthUglyNumber(3));
    }

    @Test
    public void test6() {
        assertEquals(5, solution1.nthUglyNumber(5));
        assertEquals(5, solution2.nthUglyNumber(5));
    }

    @Test
    public void test7() {
        assertEquals(3888, solution1.nthUglyNumber(134));
        assertEquals(3888, solution2.nthUglyNumber(134));
    }

    @Test
    public void test8() {
        assertEquals(536870912, solution1.nthUglyNumber(1407));
        assertEquals(536870912, solution2.nthUglyNumber(1407));
    }
}
