package com.fishercoder;

import com.fishercoder.solutions._723;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _723Test {
    private static _723.Solution1 solution1;
    private static int[][] board;
    private static int[][] expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _723.Solution1();
    }

    @Test
    public void test1() {
        board = new int[][]{
                {110, 5, 112, 113, 114},
                {210, 211, 5, 213, 214},
                {310, 311, 3, 313, 314},
                {410, 411, 412, 5, 414},
                {5, 1, 512, 3, 3},
                {610, 4, 1, 613, 614},
                {710, 1, 2, 713, 714},
                {810, 1, 2, 1, 1},
                {1, 1, 2, 2, 2},
                {4, 1, 4, 4, 1014},
        };

        expected = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {110, 0, 0, 0, 114},
                {210, 0, 0, 0, 214},
                {310, 0, 0, 113, 314},
                {410, 0, 0, 213, 414},
                {610, 211, 112, 313, 614},
                {710, 311, 412, 613, 714},
                {810, 411, 512, 713, 1014}
        };
        assert2dArrayEquals(expected, solution1.candyCrush(board));
    }

    private void assert2dArrayEquals(int[][] expected, int[][] actual) {
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

}
