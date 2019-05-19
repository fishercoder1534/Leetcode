package com.fishercoder;

import com.fishercoder.solutions._73;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _73Test {
    private static _73.Solution1 solution1;
    private static _73.Solution2 solution2;
    private static _73.Solution3 solution3;
    private static _73.Solution4 solution4;
    private static int[][] matrix;
    private static int[][] expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _73.Solution1();
        solution2 = new _73.Solution2();
        solution3 = new _73.Solution3();
        solution4 = new _73.Solution4();
    }

    @Test
    public void test1() {
        matrix = new int[][]{
                {0, 0, 0, 5},
                {4, 3, 1, 4},
                {0, 1, 1, 4},
                {1, 2, 1, 3},
                {0, 0, 1, 1}
        };
        solution1.setZeroes(matrix);
        expected = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 4},
                {0, 0, 0, 0},
                {0, 0, 0, 3},
                {0, 0, 0, 0}
        };
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void test2() {
        matrix = new int[][]{
                {0, 0, 0, 5},
                {4, 3, 1, 4},
                {0, 1, 1, 4},
                {1, 2, 1, 3},
                {0, 0, 1, 1}
        };
        solution2.setZeroes(matrix);
        expected = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 4},
                {0, 0, 0, 0},
                {0, 0, 0, 3},
                {0, 0, 0, 0}
        };
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void test3() {
        matrix = new int[][]{
                {0, 0, 0, 5},
                {4, 3, 1, 4},
                {0, 1, 1, 4},
                {1, 2, 1, 3},
                {0, 0, 1, 1}
        };
        solution3.setZeroes(matrix);
        expected = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 4},
                {0, 0, 0, 0},
                {0, 0, 0, 3},
                {0, 0, 0, 0}
        };
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void test4() {
        matrix = new int[][]{
                {0, 0, 0, 5},
                {4, 3, 1, 4},
                {0, 1, 1, 4},
                {1, 2, 1, 3},
                {0, 0, 1, 1}
        };
        solution4.setZeroes(matrix);
        expected = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 4},
                {0, 0, 0, 0},
                {0, 0, 0, 3},
                {0, 0, 0, 0}
        };
        assertArrayEquals(expected, matrix);
    }

}
