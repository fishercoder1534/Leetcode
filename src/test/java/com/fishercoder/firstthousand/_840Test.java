package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._840;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _840Test {
    private static _840.Solution1 test;
    private static int[][] grid;

    @BeforeEach
    public void setUp() {
        test = new _840.Solution1();
    }

    @Test
    public void test1() {
        grid = new int[][]{
                {4, 3, 8, 4},
                {9, 5, 1, 9},
                {2, 7, 6, 2}
        };
        assertEquals(1, test.numMagicSquaresInside(grid));
    }

    @Test
    public void test2() {
        grid = new int[][]{
                {5, 5, 5},
                {5, 5, 5},
                {5, 5, 5}
        };
        assertEquals(0, test.numMagicSquaresInside(grid));
    }

    @Test
    public void test3() {
        grid = new int[][]{
                {10, 3, 5},
                {1, 6, 11},
                {7, 9, 2}
        };
        assertEquals(0, test.numMagicSquaresInside(grid));
    }

}
