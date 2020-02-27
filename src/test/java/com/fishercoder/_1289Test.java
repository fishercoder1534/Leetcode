package com.fishercoder;

import com.fishercoder.solutions._1289;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1289Test {
    private static _1289.Solution1 solution1;
    private static int[][] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1289.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertEquals(13, solution1.minFallingPathSum(arr));
    }

}