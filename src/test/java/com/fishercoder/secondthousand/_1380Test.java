package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1380;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class _1380Test {
    private static _1380.Solution1 solution1;
    private static _1380.Solution2 solution2;
    private static int[][] matrix;

    @BeforeEach
    public void setup() {
        solution1 = new _1380.Solution1();
        solution2 = new _1380.Solution2();
    }

    @Test
    public void test1() {
        matrix = new int[][]{
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };
        assertEquals(Arrays.asList(15), solution1.luckyNumbers(matrix));
        assertEquals(Arrays.asList(15), solution2.luckyNumbers(matrix));
    }

}