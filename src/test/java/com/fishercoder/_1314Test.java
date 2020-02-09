package com.fishercoder;

import com.fishercoder.solutions._1314;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1314Test {
    private static _1314.Solution1 solution1;
    private static int[][] mat;
    private static int[][] expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _1314.Solution1();
    }

    @Test
    public void test1() {
        mat = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        expected = new int[][]{
                {12, 21, 16},
                {27, 45, 33},
                {24, 39, 28}
        };
        assertEquals(expected, solution1.matrixBlockSum(mat, 1));
    }

    @Test
    public void test2() {
        mat = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        expected = new int[][]{
                {45, 45, 45},
                {45, 45, 45},
                {45, 45, 45}
        };
        assertEquals(expected, solution1.matrixBlockSum(mat, 2));
    }
}
