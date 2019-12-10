package com.fishercoder;

import com.fishercoder.solutions._1267;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1267Test {
    private static _1267.Solution1 solution1;
    private static int[][] grid;

    @BeforeClass
    public static void setup() {
        solution1 = new _1267.Solution1();
    }

    @Test
    public void test1() {
        grid = new int[][]{
                {1, 0},
                {0, 1}
        };
        assertEquals(0, solution1.countServers(grid));
    }

    @Test
    public void test2() {
        grid = new int[][]{
                {1, 0},
                {1, 1}
        };
        assertEquals(3, solution1.countServers(grid));
    }

    @Test
    public void test3() {
        grid = new int[][]{
                {1, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };
        assertEquals(4, solution1.countServers(grid));
    }

    @Test
    public void test4() {
        grid = new int[][]{
                {1, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };
        assertEquals(6, solution1.countServers(grid));
    }

}