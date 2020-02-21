package com.fishercoder;

import com.fishercoder.solutions._1066;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1066Test {
    private static _1066.Solution1 solution1;
    private static int[][] workers;
    private static int[][] bikes;

    @Test
    public void test1() {
        solution1 = new _1066.Solution1();
        workers = new int[][]{
                {0, 0},
                {2, 1},
        };
        bikes = new int[][]{
                {1, 2},
                {3, 3},
        };
        assertEquals(6, solution1.assignBikes(workers, bikes));
    }

    @Test
    public void test2() {
        solution1 = new _1066.Solution1();
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
        assertEquals(4, solution1.assignBikes(workers, bikes));
    }

    @Test
    public void test3() {
        solution1 = new _1066.Solution1();
        workers = new int[][]{
                {0, 0},
                {1, 0},
                {2, 0},
                {3, 0},
                {4, 0},
                {5, 0},
        };
        bikes = new int[][]{
                {0, 999},
                {1, 999},
                {2, 999},
                {3, 999},
                {4, 999},
                {5, 999},
                {6, 999},
                {7, 999},
        };
        assertEquals(5994, solution1.assignBikes(workers, bikes));
    }

    @Test
    public void test4() {
        solution1 = new _1066.Solution1();
        workers = new int[][]{
                {815, 60},
                {638, 626},
                {6, 44},
                {103, 90},
                {591, 880},
        };
        bikes = new int[][]{
                {709, 161},
                {341, 339},
                {755, 955},
                {172, 27},
                {433, 489},
        };
        assertEquals(1458, solution1.assignBikes(workers, bikes));
    }
}