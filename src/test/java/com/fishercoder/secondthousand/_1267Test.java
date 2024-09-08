package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1267;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1267Test {
    private _1267.Solution1 solution1;
    private static int[][] grid;

    @BeforeEach
    public void setup() {
        solution1 = new _1267.Solution1();
    }

    @Test
    public void test1() {
        grid =
                new int[][] {
                    {1, 0},
                    {0, 1}
                };
        assertEquals(0, solution1.countServers(grid));
    }

    @Test
    public void test2() {
        grid =
                new int[][] {
                    {1, 0},
                    {1, 1}
                };
        assertEquals(3, solution1.countServers(grid));
    }

    @Test
    public void test3() {
        grid =
                new int[][] {
                    {1, 1, 0, 0},
                    {0, 0, 1, 0},
                    {0, 0, 1, 0},
                    {0, 0, 0, 1}
                };
        assertEquals(4, solution1.countServers(grid));
    }

    @Test
    public void test4() {
        grid =
                new int[][] {
                    {1, 1, 0, 0},
                    {1, 1, 1, 0},
                    {0, 0, 1, 0},
                    {0, 0, 0, 1}
                };
        assertEquals(6, solution1.countServers(grid));
    }
}
