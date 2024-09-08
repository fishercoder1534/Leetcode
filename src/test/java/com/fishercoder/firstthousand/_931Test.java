package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._931;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _931Test {
    private _931.Solution1 solution1;
    private static int[][] A;

    @BeforeEach
    public void setup() {
        solution1 = new _931.Solution1();
    }

    @Test
    public void test1() {
        A =
                new int[][] {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
                };
        assertEquals(12, solution1.minFallingPathSum(A));
    }
}
