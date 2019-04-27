package com.fishercoder;

import com.fishercoder.solutions._1011;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1011Test {
    private static _1011.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1011.Solution1();
    }

    @Test
    public void test1() {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(solution1.shipWithinDays(weights, 5), 15);
    }

    @Test
    public void test2() {
        int[] weights = {3, 2, 2, 4, 1, 4};
        assertEquals(solution1.shipWithinDays(weights, 3), 6);
    }

    @Test
    public void test3() {
        int[] weights = {1, 2, 3, 1, 1};
        assertEquals(solution1.shipWithinDays(weights, 4), 3);
    }
}
