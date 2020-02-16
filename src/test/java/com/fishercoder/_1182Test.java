package com.fishercoder;

import com.fishercoder.solutions._1182;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _1182Test {
    private static _1182.Solution1 solution1;
    private static int[] colors;
    private static int[][] queries;

    @BeforeClass
    public static void setup() {
        solution1 = new _1182.Solution1();
    }

    @Test
    public void test1() {
        colors = new int[]{1, 1, 2, 1, 3, 2, 2, 3, 3};
        queries = new int[][]{
                {1, 3},
                {2, 2},
                {6, 1}
        };
        assertEquals(Arrays.asList(3, 0, 3), solution1.shortestDistanceColor(colors, queries));
    }

    @Test
    public void test2() {
        colors = new int[]{1, 2};
        queries = new int[][]{
                {0, 3}
        };
        assertEquals(Arrays.asList(-1), solution1.shortestDistanceColor(colors, queries));
    }

}