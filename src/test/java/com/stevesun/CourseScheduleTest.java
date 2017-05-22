package com.stevesun;

import com.stevesun.solutions.CourseSchedule;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CourseScheduleTest {
    private static CourseSchedule test;
    private static boolean actual;
    private static boolean expected;
    private static int[][] prerequisites;
    private static int numCourses;

    @BeforeClass
    public static void setup(){
        test = new CourseSchedule();
    }

    @Test
    public void test1(){
        numCourses = 2;
        prerequisites = new int[][]{{0, 1}};
        expected = true;
        actual = test.canFinish(numCourses, prerequisites);
        assertEquals(expected, actual);
    }
}
