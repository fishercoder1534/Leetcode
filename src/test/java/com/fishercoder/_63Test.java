package com.fishercoder;

import com.fishercoder.solutions.firstthousand._63;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _63Test {
    private static _63.Solution1 solution1;
    private static int[][] obstacleGrid;

    @BeforeEach
    public void setup() {
        solution1 = new _63.Solution1();
    }

    @Test
    public void test1() {
        obstacleGrid = new int[][]{
                {0, 0},
                {0, 1},
        };
        assertEquals(0, solution1.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    public void test2() {
        obstacleGrid = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0},
        };
        assertEquals(2, solution1.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    public void test3() {
        int[][] obstacleGrid = new int[][]{
                {1, 0}
        };
        assertEquals(0, solution1.uniquePathsWithObstacles(obstacleGrid));
    }
}
