package com.fishercoder;

import com.fishercoder.solutions._207;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _207Test {
    private static _207.Solution1 solution1;
    private static _207.Solution2 solution2;
    private static _207.Solution3 solution3;
    private static int[][] prerequisites;
    private static int numCourses;

    @BeforeClass
    public static void setup() {
        solution1 = new _207.Solution1();
        solution2 = new _207.Solution2();
        solution3 = new _207.Solution3();
    }

    @Test
    public void test1() {
        numCourses = 2;
        prerequisites = new int[][]{{0, 1}};
        assertEquals(true, solution1.canFinish(numCourses, prerequisites));
        assertEquals(true, solution2.canFinish(numCourses, prerequisites));
        assertEquals(true, solution3.canFinish(numCourses, prerequisites));
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
        assertEquals(true, solution1.canFinish(numCourses, prerequisites));
        assertEquals(true, solution2.canFinish(numCourses, prerequisites));
        assertEquals(true, solution3.canFinish(numCourses, prerequisites));
    }

    @Test
    public void test3() {
        numCourses = 8;
        prerequisites = new int[][]{
                {3, 2},
                {3, 0},
                {5, 3},
                {5, 1},
                {7, 3},
                {7, 0},
                {6, 3},
                {6, 4},
                {4, 1},

        };
        assertEquals(true, solution1.canFinish(numCourses, prerequisites));
        assertEquals(true, solution2.canFinish(numCourses, prerequisites));
        assertEquals(true, solution3.canFinish(numCourses, prerequisites));
    }
}
