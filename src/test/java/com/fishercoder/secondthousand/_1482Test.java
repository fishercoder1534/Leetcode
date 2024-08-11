package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1482;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1482Test {
    private _1482.Solution1 solution1;
    private static int expected;
    private static int[] bloomDay;
    private static int m;
    private static int k;

    @BeforeEach
    public void setup() {
        solution1 = new _1482.Solution1();
    }

    @Test
    public void test1() {
        expected = 3;
        bloomDay = new int[]{1, 10, 3, 10, 2};
        m = 3;
        k = 1;
        assertEquals(expected, solution1.minDays(bloomDay, m, k));
    }

    @Test
    public void test2() {
        expected = -1;
        bloomDay = new int[]{1, 10, 3, 10, 2};
        m = 3;
        k = 2;
        assertEquals(expected, solution1.minDays(bloomDay, m, k));
    }

    @Test
    public void test3() {
        expected = 9;
        bloomDay = new int[]{1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
        m = 4;
        k = 2;
        assertEquals(expected, solution1.minDays(bloomDay, m, k));
    }
}
