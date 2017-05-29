package com.fishercoder;

import com.fishercoder.solutions.Searcha2DMatrix;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Searcha2DMatrixTest {
    private static Searcha2DMatrix test;
    private static boolean actual;
    private static boolean expected;
    private static int target;
    private static int[][] matrix;

    @BeforeClass
    public static void setup(){
        test = new Searcha2DMatrix();
    }

    @Before
    public void setupForEachTest(){
    }

    @Test
    public void test1(){
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
