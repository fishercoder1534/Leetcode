package com.fishercoder;

import com.fishercoder.solutions._74;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _74Test {
    private static _74 test;
    private static boolean actual;
    private static boolean expected;
    private static int target;
    private static int[][] matrix;

    @BeforeClass
    public static void setup() {
        test = new _74();
    }

    @Before
    public void setupForEachTest() {
    }

    @Test
    public void test1() {
        target = 3;
        matrix = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50},
        };
        expected = true;
        actual = test.searchMatrix(matrix, target);
        assertEquals(expected, actual);
    }
}
