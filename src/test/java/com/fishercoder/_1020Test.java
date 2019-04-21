package com.fishercoder;

import com.fishercoder.solutions._1020;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1020Test {
    private static _1020.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1020.Solution1();
    }

    @Test
    public void test1() {
        int[][] map = {
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}
        };

        assertEquals(solution1.numEnclaves(map), 3);
    }

    @Test
    public void test2() {
        int[][] map = {
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0}
        };

        assertEquals(solution1.numEnclaves(map), 0);
    }

    @Test
    public void test3() {
        int[][] map = {
                {0, 1, 1, 0},
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {1, 0, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0},
        };

        assertEquals(solution1.numEnclaves(map), 3);
    }
}
