package com.fishercoder;

import com.fishercoder.solutions._1277;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1277Test {
    private static _1277.Solution1 solution1;
    private static _1277.Solution2 solution2;
    private static int[][] matrix;

    @BeforeClass
    public static void setup() {
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