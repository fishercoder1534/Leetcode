package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._73;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _73Test {
    private _73.Solution1 solution1;
    private _73.Solution2 solution2;
    private _73.Solution3 solution3;
    private _73.Solution4 solution4;
    private static int[][] matrix;
    private static int[][] expected;

    @BeforeEach
    public void setup() {
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
