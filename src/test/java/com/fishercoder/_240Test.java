package com.fishercoder;

import com.fishercoder.solutions._240;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _240Test {
    private static _240.Solution1 solution1;
    private static boolean actual;
    private static boolean expected;
    private static int target;
    private static int[][] matrix;

    @BeforeClass
    public static void setup() {
        solution1 = new _240.Solution1();
    }

    @Before
    public void setupForEachTest() {
    }

    @Test
    public void test1() {
        target = 5;
        matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        expected = true;
        actual = solution1.searchMatrix(matrix, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        target = 0;
        matrix = new int[][]{};
        expected = false;
        actual = solution1.searchMatrix(matrix, target);
        assertEquals(expected, actual);
    }
}
