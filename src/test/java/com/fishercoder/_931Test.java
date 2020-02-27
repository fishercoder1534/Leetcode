package com.fishercoder;

import com.fishercoder.solutions._931;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _931Test {
    private static _931.Solution1 solution1;
    private static int[][] A;

    @BeforeClass
    public static void setup() {
        solution1 = new _931.Solution1();
    }

    @Test
    public void test1() {
        A = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertEquals(12, solution1.minFallingPathSum(A));
    }

}