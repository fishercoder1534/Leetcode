package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1252;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1252Test {
    private _1252.Solution1 solution1;
    private _1252.Solution2 solution2;
    private static int[][] indices;

    @BeforeEach
    public void setup() {
        solution1 = new _1252.Solution1();
        solution2 = new _1252.Solution2();
    }

    @Test
    public void test1() {
        indices =
                new int[][] {
                    {0, 1},
                    {1, 1}
                };
        assertEquals(6, solution1.oddCells(2, 3, indices));
    }

    @Test
    public void test2() {
        indices =
                new int[][] {
                    {1, 1},
                    {0, 0}
                };
        assertEquals(0, solution1.oddCells(2, 2, indices));
    }

    @Test
    public void test3() {
        indices =
                new int[][] {
                    {0, 1},
                    {1, 1}
                };
        assertEquals(6, solution2.oddCells(2, 3, indices));
    }

    @Test
    public void test4() {
        indices =
                new int[][] {
                    {1, 1},
                    {0, 0}
                };
        assertEquals(0, solution2.oddCells(2, 2, indices));
    }
}
