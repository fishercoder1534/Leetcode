package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1277;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1277Test {
    private _1277.Solution1 solution1;
    private _1277.Solution2 solution2;
    private static int[][] matrix;

    @BeforeEach
    public void setup() {
        solution1 = new _1277.Solution1();
        solution2 = new _1277.Solution2();
    }

    @Test
    public void test1() {
        matrix = new int[][]{
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1}
        };
        assertEquals(15, solution1.countSquares(matrix));
    }

    @Test
    public void test2() {
        matrix = new int[][]{
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1}
        };
        assertEquals(15, solution2.countSquares(matrix));
    }

}