package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._883;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _883Test {
    private _883.Solution1 solution1;
    private static int[][] grid;

    @BeforeEach
    public void setup() {
        solution1 = new _883.Solution1();
    }

    @Test
    public void test1() {
        grid = new int[][] {{2}};
        assertEquals(5, solution1.projectionArea(grid));
    }

    @Test
    public void test2() {
        grid =
                new int[][] {
                    {1, 2},
                    {3, 4},
                };
        assertEquals(17, solution1.projectionArea(grid));
    }
}
