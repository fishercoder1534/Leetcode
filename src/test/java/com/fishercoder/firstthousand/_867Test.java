package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._867;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class _867Test {
    private _867.Solution1 solution1;
    private static int[][] A;
    private static int[][] result;

    @BeforeEach
    public void setup() {
        solution1 = new _867.Solution1();
    }

    @Test
    public void test1() {
        A = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        result = new int[][]{
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        assertArrayEquals(result, solution1.transpose(A));
    }

    @Test
    public void test2() {
        A = new int[][]{
                {1, 2, 3}
        };
        result = new int[][]{
                {1},
                {2},
                {3}
        };
        assertArrayEquals(result, solution1.transpose(A));
    }

    @Test
    public void test3() {
        A = new int[][]{
                {1},
                {2},
                {3}
        };
        result = new int[][]{
                {1, 2, 3}
        };
        assertArrayEquals(result, solution1.transpose(A));
    }

    @Test
    public void test4() {
        A = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        result = new int[][]{
                {1, 5, 9},
                {2, 6, 10},
                {3, 7, 11},
                {4, 8, 12}
        };
        assertArrayEquals(result, solution1.transpose(A));
    }

}