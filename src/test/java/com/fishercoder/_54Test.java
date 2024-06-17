package com.fishercoder;

import com.fishercoder.solutions.first_thousand._54;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _54Test {
    private static _54.Solution1 solution1;
    private static int[][] matrix;

    @BeforeEach
    public void setup() {
        solution1 = new _54.Solution1();
    }

    @Test
    public void test1() {
        matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        assertEquals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5), solution1.spiralOrder(matrix));
    }

    @Test
    public void test2() {
        matrix = new int[][]{};
        assertEquals(Arrays.asList(), solution1.spiralOrder(matrix));
    }
}
