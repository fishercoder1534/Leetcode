package com.fishercoder;

import com.fishercoder.solutions._498;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by fishercoder on 5/26/17.
 */
public class _498Test {
    private static _498.Solutoin1 solutoin1;
    private static int[][] matrix;
    private static int[] expected;

    @BeforeClass
    public static void setup() {
        solutoin1 = new _498.Solutoin1();
    }

    @Test
    public void test1() {
        matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        expected = new int[]{1, 2, 4, 7, 5, 3, 6, 8, 9};
        assertArrayEquals(expected, solutoin1.findDiagonalOrder(matrix));
    }

    @Test
    public void test2() {
        matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
                {13, 14, 15},
        };
        expected = new int[]{1, 2, 4, 7, 5, 3, 6, 8, 10, 13, 11, 9, 12, 14, 15};
        assertArrayEquals(expected, solutoin1.findDiagonalOrder(matrix));
    }
}
