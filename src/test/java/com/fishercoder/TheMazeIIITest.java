package com.fishercoder;

import com.fishercoder.solutions.TheMazeIII;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TheMazeIIITest {
    private static TheMazeIII test;
    private static String expected;
    private static String actual;
    private static int[][] maze;
    private static int[] ball;
    private static int[] hole;

    @BeforeClass
    public static void setup(){
        test = new TheMazeIII();
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
        ball = new int[]{4,3};
        hole = new int[]{0,1};
        actual = test.findShortestWay(maze, ball, hole);
        expected = "lul";
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
        ball = new int[]{0,4};
        hole = new int[]{4,4};
        actual = test.findShortestWay(maze, ball, hole);
        expected = "ldldrdr";
        assertEquals(expected, actual);
    }
}
