package com.fishercoder;

import com.fishercoder.solutions._1341;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1341Test {
    private static _1341.Solution1 solution1;
    private static int[][] mat;

    @BeforeClass
    public static void setup() {
        solution1 = new _1341.Solution1();
    }

    @Test
    public void test1() {
        mat = new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        assertArrayEquals(new int[]{2, 0}, solution1.kWeakestRows(mat, 2));
    }

    @Test
    public void test2() {
        mat = new int[][]{
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}
        };
        assertArrayEquals(new int[]{0, 2}, solution1.kWeakestRows(mat, 2));
    }

}