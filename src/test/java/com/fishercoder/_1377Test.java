package com.fishercoder;

import com.fishercoder.solutions._1377;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1377Test {
    private static _1377.Solution1 solution1;
    private static int[][] edges;

    @BeforeClass
    public static void setup() {
        solution1 = new _1377.Solution1();
    }

    @Test
    public void test1() {
        edges = new int[][]{
                {1, 2},
                {1, 3},
                {1, 7},
                {2, 4},
                {2, 6},
                {3, 5},
        };
        assertEquals(0.16666666666666666, solution1.frogPosition(7, edges, 2, 4), 0);
    }

    @Test
    public void test2() {
        edges = new int[][]{
                {1, 2},
                {1, 3},
                {1, 7},
                {2, 4},
                {2, 6},
                {3, 5},
        };
        assertEquals(0.3333333333333333, solution1.frogPosition(7, edges, 1, 7), 0);
    }

    @Test
    public void test3() {
        edges = new int[][]{
                {1, 2},
                {1, 3},
                {1, 7},
                {2, 4},
                {2, 6},
                {3, 5},
        };
        assertEquals(0.16666666666666666, solution1.frogPosition(7, edges, 20, 6), 0);
    }

    @Test
    public void test4() {
        edges = new int[][]{
                {2, 1},
                {3, 2},
        };
        assertEquals(1.0, solution1.frogPosition(3, edges, 1, 2), 0);
    }

    @Test
    public void test5() {
        edges = new int[][]{
                {2, 1},
                {3, 2},
                {4, 1},
                {5, 1},
                {6, 4},
                {7, 1},
                {8, 7},
        };
        assertEquals(0.0, solution1.frogPosition(8, edges, 7, 7), 0);
    }

}