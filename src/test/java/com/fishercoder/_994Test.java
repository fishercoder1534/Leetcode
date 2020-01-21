package com.fishercoder;

import com.fishercoder.solutions._994;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _994Test {
    private static _994.Solution1 solution1;
    private static int[][] grid;

    @BeforeClass
    public static void setUp() {
        solution1 = new _994.Solution1();
    }

    @Test
    public void test1() {
        grid = new int[][]{
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        assertEquals(4, solution1.orangesRotting(grid));
    }

    @Test
    public void test2() {
        grid = new int[][]{
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        };
        assertEquals(-1, solution1.orangesRotting(grid));
    }

    @Test
    public void test3() {
        grid = new int[][]{
                {0, 2}
        };
        assertEquals(0, solution1.orangesRotting(grid));
    }
}
