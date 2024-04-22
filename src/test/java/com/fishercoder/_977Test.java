package com.fishercoder;

import com.fishercoder.solutions._977;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _977Test {
    private static _977.Solution1 solution1;
    private static _977.Solution2 solution2;
    private static int[] A;

    @BeforeClass
    public static void setup() {
        solution1 = new _977.Solution1();
        solution2 = new _977.Solution2();
    }

    @Test
    public void test1() {
        A = new int[]{-4, -1, 0, 3, 10};
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, solution1.sortedSquares(A));
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, solution2.sortedSquares(A));
    }

    @Test
    public void test2() {
        A = new int[]{-7, -3, 2, 3, 11};
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, solution1.sortedSquares(A));
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, solution2.sortedSquares(A));
    }
}
