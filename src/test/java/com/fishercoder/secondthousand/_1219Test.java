package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1219;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1219Test {
    private _1219.Solution1 solution1;
    private static int[][] grid;

    @BeforeEach
    public void setup() {
        solution1 = new _1219.Solution1();
    }

    @Test
    public void test1() {
        grid = new int[][]{
                {0, 6, 0},
                {5, 8, 7},
                {0, 9, 0},
        };
        assertEquals(24, solution1.getMaximumGold(grid));
    }

    @Test
    public void test2() {
        grid = new int[][]{
                {1, 0, 7},
                {2, 0, 6},
                {3, 4, 5},
                {0, 3, 0},
                {9, 0, 20},
        };
        assertEquals(28, solution1.getMaximumGold(grid));
    }

    @Test
    public void test3() {
        grid = new int[][]{
                {0, 0, 19, 5, 8},
                {11, 20, 14, 1, 0},
                {0, 0, 1, 1, 1},
                {0, 2, 0, 2, 0},
        };
        assertEquals(77, solution1.getMaximumGold(grid));
    }
}
