package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._74;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _74Test {
    private static _74.Solution1 solution1;
    private static int target;
    private static int[][] matrix;

    @BeforeEach
    public void setup() {
        solution1 = new _74.Solution1();
    }

    @Test
    public void test1() {
        target = 3;
        matrix = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50},
        };
        assertEquals(true, solution1.searchMatrix(matrix, target));
    }
}
