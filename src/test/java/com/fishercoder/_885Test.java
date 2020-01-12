package com.fishercoder;

import com.fishercoder.solutions._885;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _885Test {
    private static _885.Solution1 solution1;
    private static int[][] expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _885.Solution1();
    }

    @Test
    public void test1() {
        expected = new int[][]{
                {0, 0},
                {0, 1},
                {0, 2},
                {0, 3}
        };
        assertArrayEquals(expected, solution1.spiralMatrixIII(1, 4, 0, 0));
    }

    @Test
    public void test2() {
        expected = new int[][]{
                {1, 4},
                {1, 5},
                {2, 5},
                {2, 4},
                {2, 3},
                {1, 3},
                {0, 3},
                {0, 4},
                {0, 5},
                {3, 5},
                {3, 4},
                {3, 3},
                {3, 2},
                {2, 2},
                {1, 2},
                {0, 2},
                {4, 5},
                {4, 4},
                {4, 3},
                {4, 2},
                {4, 1},
                {3, 1},
                {2, 1},
                {1, 1},
                {0, 1},
                {4, 0},
                {3, 0},
                {2, 0},
                {1, 0},
                {0, 0}
        };
        assertArrayEquals(expected, solution1.spiralMatrixIII(5, 6, 1, 4));
    }

}
