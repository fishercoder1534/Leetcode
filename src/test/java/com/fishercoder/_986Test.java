package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._986;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _986Test {
    private static _986.Solution1 solution1;
    private static int[][] A;
    private static int[][] B;
    private static int[][] expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _986.Solution1();
    }

    @Test
    public void test1() {
        A = new int[][]{
                {0, 2},
                {5, 10},
                {13, 23},
                {24, 25}
        };
        B = new int[][]{
                {1, 5},
                {8, 12},
                {15, 24},
                {25, 26}
        };
        expected = new int[][]{
                {1, 2},
                {5, 5},
                {8, 10},
                {15, 23},
                {24, 24},
                {25, 25}
        };
        int[][] actual = solution1.intervalIntersection(A, B);
        CommonUtils.print2DIntArray(actual);
        assertEquals(expected, actual);
    }


}
