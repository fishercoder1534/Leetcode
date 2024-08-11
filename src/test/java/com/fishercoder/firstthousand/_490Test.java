package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._490;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _490Test {
    private _490 test;
    private static boolean expected;
    private static boolean actual;
    private static int[][] maze;
    private static int[] start;
    private static int[] destination;

    @BeforeEach
    public void setup() {
        test = new _490();
    }

    @BeforeEach
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
        actual = test.hasPath(maze, start, destination);
        expected = false;
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
        actual = test.hasPath(maze, start, destination);
        expected = true;
        assertEquals(expected, actual);
    }
}
