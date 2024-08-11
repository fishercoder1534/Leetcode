package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2144;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2144Test {
    private _2144.Solution1 solution1;
    private static int[] cost;
    private static int expected;

    @BeforeEach
    public void setup() {
        solution1 = new _2144.Solution1();
    }

    @Test
    public void test1() {
        expected = 5;
        cost = new int[]{1, 2, 3};
        assertEquals(expected, solution1.minimumCost(cost));
    }

    @Test
    public void test2() {
        expected = 23;
        cost = new int[]{6, 5, 7, 9, 2, 2};
        assertEquals(expected, solution1.minimumCost(cost));
    }

    @Test
    public void test3() {
        expected = 10;
        cost = new int[]{5, 5};
        assertEquals(expected, solution1.minimumCost(cost));
    }

}
