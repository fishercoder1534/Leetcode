package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1182;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1182Test {
    private _1182.Solution1 solution1;
    private static int[] colors;
    private static int[][] queries;

    @BeforeEach
    public void setup() {
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