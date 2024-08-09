package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1020;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1020Test {
    private _1020.Solution1 solution1;

    @BeforeEach
    public void setup() {
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
