package com.fishercoder;

import com.fishercoder.solutions._200;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _200Test {
    private static _200.Solution1 solution1;
    private static _200.Solution2 solution2;
    private static char[][] grid;

    @Before
    public void setup() {
        solution1 = new _200.Solution1();
        solution2 = new _200.Solution2();
    }

    @Test
    public void test1() {
        grid = new char[][]{
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'},
        };
        assertEquals(1, solution1.numIslands(grid));

        grid = new char[][]{
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'},
        };
        assertEquals(1, solution2.numIslands(grid));
    }

    @Test
    public void test2() {
        grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
        };
        assertEquals(1, solution1.numIslands(grid));

        grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
        };
        assertEquals(1, solution2.numIslands(grid));
    }

    @Test
    public void test3() {
        grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };
        assertEquals(3, solution1.numIslands(grid));

        grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };
        assertEquals(3, solution2.numIslands(grid));
    }

}
