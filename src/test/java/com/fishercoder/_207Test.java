package com.fishercoder;

import com.fishercoder.solutions._207;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _207Test {
    private static _207.Solution1 test;
    private static int[][] prerequisites;
    private static int numCourses;

    @BeforeClass
    public static void setup() {
        test = new _207.Solution1();
    }

    @Test
    public void test1() {
        numCourses = 2;
        prerequisites = new int[][]{{0, 1}};
        assertEquals(true, test.canFinish(numCourses, prerequisites));
    }

    @Test
    public void test2() {
        numCourses = 8;
        prerequisites = new int[][]{
                {3, 0},
                {3, 1},
                {5, 3},
                {5, 2},
                {6, 3},
                {6, 1},
                {7, 3},
                {7, 4},
                {4, 2},

        };
        assertEquals(true, test.canFinish(numCourses, prerequisites));
    }
}
