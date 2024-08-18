package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.thirdthousand._2373;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2373Test {

    private _2373.Solution1 solution1;
    private static int[][] grid;
    private static int[][] expected;

    @BeforeEach
    public void setup() {
        solution1 = new _2373.Solution1();
    }

    @Test
    public void test1() {
        grid =
                new int[][] {
                    {9, 9, 8, 1},
                    {5, 6, 2, 6},
                    {8, 2, 6, 4},
                    {6, 2, 2, 2}
                };
        expected =
                new int[][] {
                    {9, 9},
                    {8, 6}
                };
        assertArrayEquals(expected, solution1.largestLocal(grid));
    }
}
