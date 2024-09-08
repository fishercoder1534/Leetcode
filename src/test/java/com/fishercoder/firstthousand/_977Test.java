package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.firstthousand._977;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _977Test {
    private _977.Solution1 solution1;
    private _977.Solution2 solution2;
    private static int[] A;

    @BeforeEach
    public void setup() {
        solution1 = new _977.Solution1();
        solution2 = new _977.Solution2();
    }

    @Test
    public void test1() {
        A = new int[] {-4, -1, 0, 3, 10};
        assertArrayEquals(new int[] {0, 1, 9, 16, 100}, solution1.sortedSquares(A));
        assertArrayEquals(new int[] {0, 1, 9, 16, 100}, solution2.sortedSquares(A));
    }

    @Test
    public void test2() {
        A = new int[] {-7, -3, 2, 3, 11};
        assertArrayEquals(new int[] {4, 9, 9, 49, 121}, solution1.sortedSquares(A));
        assertArrayEquals(new int[] {4, 9, 9, 49, 121}, solution2.sortedSquares(A));
    }
}
