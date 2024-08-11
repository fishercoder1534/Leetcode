package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._289;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _289Test {
    private _289.Solution1 solution1;
    private int[][] board;

    @BeforeEach
    public void setup() {
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
        assertArrayEquals(expected, board);
    }

}
