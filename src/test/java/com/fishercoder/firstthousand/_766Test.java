package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._766;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _766Test {
    private _766.Solution1 solution1;
    private static int[][] matrix;

    @BeforeEach
    public void setup() {
        solution1 = new _766.Solution1();
    }

    @Test
    public void test1() {
        matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };
        assertEquals(true, solution1.isToeplitzMatrix(matrix));
    }

    @Test
    public void test2() {
        matrix = new int[][]{
                {1, 2},
                {2, 2},
        };
        assertEquals(false, solution1.isToeplitzMatrix(matrix));
    }

    @Test
    public void test3() {
        matrix = new int[][]{
                {1, 2, 3, 4, 5, 9},
                {5, 1, 2, 3, 4, 5},
                {9, 5, 1, 2, 3, 4}
        };
        assertEquals(true, solution1.isToeplitzMatrix(matrix));
    }
}
