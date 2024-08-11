package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._773;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _773Test {
    private _773.Solution1 solution1;
    private static int[][] board;

    @BeforeEach
    public void setup() {
        solution1 = new _773.Solution1();
    }

    @Test
    public void test1() {
        board = new int[][]{
                {1, 2, 3},
                {4, 0, 5}
        };
        assertEquals(1, solution1.slidingPuzzle(board));
    }

    @Test
    public void test2() {
        board = new int[][]{
                {4, 1, 2},
                {5, 0, 3}
        };
        assertEquals(5, solution1.slidingPuzzle(board));
    }

}