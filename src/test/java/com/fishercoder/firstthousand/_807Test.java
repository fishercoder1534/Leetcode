package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._807;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _807Test {
    private _807.Solution1 solution1;
    private static int[][] grid;

    @BeforeEach
    public void setup() {
        solution1 = new _807.Solution1();
    }

    @Test
    public void test1() {
        grid = new int[][]{
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        };
        assertEquals(35, solution1.maxIncreaseKeepingSkyline(grid));
    }


}
