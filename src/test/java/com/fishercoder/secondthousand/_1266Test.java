package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1266;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1266Test {
    private _1266.Solution1 solution1;
    private static int[][] points;

    @BeforeEach
    public void setup() {
        solution1 = new _1266.Solution1();
    }

    @Test
    public void test1() {
        points =
                new int[][] {
                    {1, 1},
                    {3, 4},
                    {-1, 0}
                };
        assertEquals(7, solution1.minTimeToVisitAllPoints(points));
    }

    @Test
    public void test2() {
        points =
                new int[][] {
                    {3, 2},
                    {-2, 2}
                };
        assertEquals(5, solution1.minTimeToVisitAllPoints(points));
    }
}
