package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._980;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _980Test {
    private _980.Solution1 solution1;
    private static int[][] grid;

    @Test
    public void test1() {
        solution1 = new _980.Solution1();
        grid = new int[][]{
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 2, -1},
        };
        assertEquals(2, solution1.uniquePathsIII(grid));
    }

    @Test
    public void test2() {
        solution1 = new _980.Solution1();
        grid = new int[][]{
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 2},
        };
        assertEquals(4, solution1.uniquePathsIII(grid));
    }

    @Test
    public void test3() {
        solution1 = new _980.Solution1();
        grid = new int[][]{
                {0, 1},
                {2, 0},
        };
        assertEquals(0, solution1.uniquePathsIII(grid));
    }

}