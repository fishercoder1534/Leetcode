package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._746;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _746Test {
    private _746.Solution1 solution1;
    private static int[] cost;

    @BeforeEach
    public void setUp() {
        solution1 = new _746.Solution1();
    }

    @Test
    public void test1() {
        cost = new int[] {10, 15, 20};
        assertEquals(15, solution1.minCostClimbingStairs(cost));
    }

    @Test
    public void test2() {
        cost = new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        assertEquals(6, solution1.minCostClimbingStairs(cost));
    }
}
