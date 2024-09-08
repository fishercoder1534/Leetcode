package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.secondthousand._1341;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1341Test {
    private _1341.Solution1 solution1;
    private static int[][] mat;

    @BeforeEach
    public void setup() {
        solution1 = new _1341.Solution1();
    }

    @Test
    public void test1() {
        mat =
                new int[][] {
                    {1, 1, 0, 0, 0},
                    {1, 1, 1, 1, 0},
                    {1, 0, 0, 0, 0},
                    {1, 1, 0, 0, 0},
                    {1, 1, 1, 1, 1}
                };
        assertArrayEquals(new int[] {2, 0}, solution1.kWeakestRows(mat, 2));
    }

    @Test
    public void test2() {
        mat =
                new int[][] {
                    {1, 0, 0, 0},
                    {1, 1, 1, 1},
                    {1, 0, 0, 0},
                    {1, 0, 0, 0}
                };
        assertArrayEquals(new int[] {0, 2}, solution1.kWeakestRows(mat, 2));
    }
}
