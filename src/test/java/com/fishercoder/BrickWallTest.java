package com.fishercoder;

import com.fishercoder.solutions.BrickWall;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class BrickWallTest {
    private static BrickWall test;
    private static int expected;
    private static int actual;
    private static List<List<Integer>> wall;

    @BeforeClass
    public static void setup(){
        test = new BrickWall();
    }

    @Before
    public void setupForEachTest(){}

    @Test
    public void test1(){
        wall = new ArrayList<>();
        wall.add(Arrays.asList(1,2,2,1));
        wall.add(Arrays.asList(3,1,2));
        wall.add(Arrays.asList(1,3,2));
        wall.add(Arrays.asList(2,4));
        wall.add(Arrays.asList(3,1,2));
        wall.add(Arrays.asList(1,3,1,1));
        expected = 2;
        actual = test.leastBricks(wall);
        assertEquals(expected, actual);
    }
}
