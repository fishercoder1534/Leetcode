package com.fishercoder;

import com.fishercoder.solutions._54;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _54Test {

    private static _54.Solution1 solution1;
    private static int[][] matrix;

    @BeforeClass
    public static void setup() {
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
