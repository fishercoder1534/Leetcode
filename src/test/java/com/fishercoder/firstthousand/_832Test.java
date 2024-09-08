package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.firstthousand._832;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _832Test {
    private _832.Solution1 solution1;
    private static int[][] expected;
    private static int[][] A;

    @BeforeEach
    public void setUp() {
        solution1 = new _832.Solution1();
    }

    @Test
    public void test1() {
        A =
                new int[][] {
                    {1, 1, 0},
                    {1, 0, 1},
                    {0, 0, 0}
                };
        expected =
                new int[][] {
                    {1, 0, 0},
                    {0, 1, 0},
                    {1, 1, 1}
                };
        assertArrayEquals(expected, solution1.flipAndInvertImage(A));
    }

    @Test
    public void test2() {
        A =
                new int[][] {
                    {1, 1, 0, 0},
                    {1, 0, 0, 1},
                    {0, 1, 1, 1},
                    {1, 0, 1, 0}
                };
        expected =
                new int[][] {
                    {1, 1, 0, 0},
                    {0, 1, 1, 0},
                    {0, 0, 0, 1},
                    {1, 0, 1, 0}
                };
        assertArrayEquals(expected, solution1.flipAndInvertImage(A));
    }
}
