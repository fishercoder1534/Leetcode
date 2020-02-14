package com.fishercoder;

import com.fishercoder.solutions._807;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _807Test {
    private static _807.Solution1 solution1;
    private static int[][] grid;

    @BeforeClass
    public static void setup() {
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
