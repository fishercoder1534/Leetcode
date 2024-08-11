package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._661;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _661Test {
    private _661.Solution1 solution1;
    private static int[][] M;
    private static int[][] expected;

    @BeforeEach
    public void setup() {
        solution1 = new _661.Solution1();
    }

    @Test
    public void test1() {
        M = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        expected = M = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        assertArrayEquals(expected, solution1.imageSmoother(M));
    }

}
