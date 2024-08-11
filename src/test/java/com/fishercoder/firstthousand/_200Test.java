package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._200;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _200Test {
    private _200.Solution1 solution1;
    private _200.Solution2 solution2;
    private char[][] grid;

    @BeforeEach
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
