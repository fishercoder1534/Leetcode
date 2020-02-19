package com.fishercoder;

import com.fishercoder.solutions._1057;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1057Test {
    private static _1057.Solution1 solution1;
    private static int[][] workers;
    private static int[][] bikes;

    @BeforeClass
    public static void setup() {
        solution1 = new _1057.Solution1();
    }

    @Test
    public void test1() {
        workers = new int[][]{
                {0, 0},
                {2, 1},
        };
        bikes = new int[][]{
                {1, 2},
                {3, 3},
        };
        assertArrayEquals(new int[]{1, 0}, solution1.assignBikes(workers, bikes));
    }

    @Test
    public void test2() {
        workers = new int[][]{
                {0, 0},
                {1, 1},
                {2, 0},
        };
        bikes = new int[][]{
                {1, 0},
                {2, 2},
                {2, 1},
        };
        assertArrayEquals(new int[]{0, 2, 1}, solution1.assignBikes(workers, bikes));
    }

}