package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._694;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _694Test {
    private _694.Solution1 solution1;
    private static int[][] grid;

    @BeforeEach
    public void setup() {
        solution1 = new _694.Solution1();
    }

    @Test
    public void test1() {
        grid =
                new int[][] {
                    {1, 1, 0, 1, 1},
                    {1, 0, 0, 0, 0},
                    {0, 0, 0, 0, 1},
                    {1, 1, 0, 1, 1}
                };
        assertEquals(3, solution1.numDistinctIslands(grid));
    }

    @Test
    public void test2() {
        grid =
                new int[][] {
                    {1, 1, 0, 0, 0},
                    {1, 1, 0, 0, 0},
                    {0, 0, 0, 1, 1},
                    {0, 0, 0, 1, 1}
                };
        assertEquals(1, solution1.numDistinctIslands(grid));
    }
}
