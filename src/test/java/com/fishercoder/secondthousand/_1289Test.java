package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1289;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1289Test {
    private _1289.Solution1 solution1;
    private static int[][] arr;

    @BeforeEach
    public void setup() {
        solution1 = new _1289.Solution1();
    }

    @Test
    public void test1() {
        arr =
                new int[][] {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
                };
        assertEquals(13, solution1.minFallingPathSum(arr));
    }
}
