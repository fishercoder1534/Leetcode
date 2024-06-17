package com.fishercoder;

import com.fishercoder.solutions.firstthousand._304;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _304Test {
    private static _304.Solution1.NumMatrix numMatrix;
    private static int[][] matrix;

    @BeforeEach
    public void setup() {

    }

    @Test
    public void test1() {
        matrix = new int[][]{
                {3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}
        };
        numMatrix = new _304.Solution1.NumMatrix(matrix);
        assertEquals(8, numMatrix.sumRegion(2, 1, 4, 3));
    }

}