package com.fishercoder;

import com.fishercoder.solutions.TheMazeII;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TheMazeIITest {
    private static TheMazeII test;
    private static int expected;
    private static int actual;
    private static int[][] maze;
    private static int[] start;
    private static int[] destination;

    @BeforeClass
    public static void setup(){
        test = new TheMazeII();
    }

    @Before
    public void setupForEachTest(){}

    @Test
    public void test1(){
        maze = new int[][]{
        {0,0,0,0,0},
        {1,1,0,0,1},
        {0,0,0,0,0},
        {0,1,0,0,1},
        {0,1,0,0,0}
        };
        start = new int[]{4,3};
        destination = new int[]{0,1};
        actual = test.shortestDistance(maze, start, destination);
        expected = -1;
        assertEquals(expected, actual);

    }

    @Test
    public void test2(){
        maze = new int[][]{
                {0,0,1,0,0},
                {0,0,0,0,0},
                {0,0,0,1,0},
                {1,1,0,1,1},
                {0,0,0,0,0}
        };
        start = new int[]{0,4};
        destination = new int[]{4,4};
        actual = test.shortestDistance(maze, start, destination);
        expected = 12;
        assertEquals(expected, actual);
    }
}
