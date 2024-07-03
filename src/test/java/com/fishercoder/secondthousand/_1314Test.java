package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1314;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1314Test {
    private static _1314.Solution1 solution1;
    private static _1314.Solution2 solution2;
    private static int[][] mat;
    private static int[][] expected;

    @BeforeEach
    public void setup() {
        solution1 = new _1314.Solution1();
        solution2 = new _1314.Solution2();
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
        assertArrayEquals(expected, solution1.matrixBlockSum(mat, 1));
        assertArrayEquals(expected, solution2.matrixBlockSum(mat, 1));
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
        assertArrayEquals(expected, solution1.matrixBlockSum(mat, 2));
        assertArrayEquals(expected, solution2.matrixBlockSum(mat, 2));
    }
}
