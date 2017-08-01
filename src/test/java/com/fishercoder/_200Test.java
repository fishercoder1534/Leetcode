package com.fishercoder;

import com.fishercoder.solutions._200;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _200Test {
    private static _200.DFSSolution dfsSolution;
    private static _200.UnionFindSolution unionFindSolution;
    private static char[][] grid;

    @Before
    public void setup(){
        dfsSolution = new _200.DFSSolution();
        unionFindSolution = new _200.UnionFindSolution();
    }

    @Test
    public void test1(){
        grid = new char[][]{
                {'1','1','1'},
                {'0','1','0'},
                {'1','1','1'},
        };
        assertEquals(1, dfsSolution.numIslands(grid));

        grid = new char[][]{
                {'1','1','1'},
                {'0','1','0'},
                {'1','1','1'},
        };
        assertEquals(1, unionFindSolution.numIslands(grid));
    }

    @Test
    public void test2(){
        grid = new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'},
        };
        assertEquals(1, dfsSolution.numIslands(grid));

        grid = new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'},
        };
        assertEquals(1, unionFindSolution.numIslands(grid));
    }

    @Test
    public void test3(){
        grid = new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'},
        };
        assertEquals(3, dfsSolution.numIslands(grid));

        grid = new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'},
        };
        assertEquals(3, unionFindSolution.numIslands(grid));
    }

}
