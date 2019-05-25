package com.fishercoder;

import com.fishercoder.solutions._505;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _505Test {
    private static _505.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static int[][] maze;
    private static int[] start;
    private static int[] destination;

    @BeforeClass
    public static void setup() {
        solution1 = new _505.Solution1();
    }

    @Before
    public void setupForEachTest() {
    }

    @Test
    public void test1() {
        maze = new int[][]{
                {0, 0, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {0, 1, 0, 0, 0}
        };
        start = new int[]{4, 3};
        destination = new int[]{0, 1};
        actual = solution1.shortestDistance(maze, start, destination);
        expected = -1;
        assertEquals(expected, actual);

    }

    @Test
    public void test2() {
        maze = new int[][]{
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        };
        start = new int[]{0, 4};
        destination = new int[]{4, 4};
        actual = solution1.shortestDistance(maze, start, destination);
        expected = 12;
        assertEquals(expected, actual);
    }
}
