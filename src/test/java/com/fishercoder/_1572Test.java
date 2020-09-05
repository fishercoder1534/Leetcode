package com.fishercoder;

import com.fishercoder.solutions._1572;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1572Test {
    private static _1572.Solution1 solution1;
    private static int[][] mat;

    @BeforeClass
    public static void setup() {
        solution1 = new _1572.Solution1();
    }

    @Test
    public void test1() {
        mat = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertEquals(25, solution1.diagonalSum(mat));
    }

    @Test
    public void test2() {
        mat = new int[][]{
                {5}
        };
        assertEquals(5, solution1.diagonalSum(mat));
    }

    @Test
    public void test3() {
        mat = new int[][]{
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
        };
        assertEquals(8, solution1.diagonalSum(mat));
    }

}