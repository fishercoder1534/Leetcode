package com.stevesun;

import com.stevesun.solutions.DiagonalTraverse;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DiagonalTraverseTest {
    private static DiagonalTraverse test;
    private static int[] expected;
    private static int[] actual;
    private static int[][] matrix;

    @BeforeClass
    public static void setup(){
        test = new DiagonalTraverse();
    }

    @Before
    public void setupForEachTest(){
        expected = new int[]{};
        actual = new int[]{};
    }

    @Test
    public void test1(){
//        matrix = new int[][]{
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        expected = new int[]{1,2,4,7,5,3,6,8,9};
//        actual = test.findDiagonalOrder(matrix);
//        assertEquals(expected, actual);

    }
}
