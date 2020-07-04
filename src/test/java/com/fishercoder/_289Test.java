package com.fishercoder;

import com.fishercoder.solutions._289;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _289Test {
    private static _289.Solution1 solution1;
    private static int[][] board;

    @BeforeClass
    public static void setup() {
        solution1 = new _289.Solution1();
    }

    @Test
    public void test1() {
        board = new int[][]{
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        solution1.gameOfLife(board);
        int[][] expected = new int[][]{
                {0, 0, 0},
                {1, 0, 1},
                {0, 1, 1},
                {0, 1, 0}
        };
        assertEquals(expected, board);
    }

}
