package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1198;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1198Test {
    private _1198.Solution1 solution1;
    private static int[][] mat;

    @BeforeEach
    public void setup() {
        solution1 = new _1198.Solution1();
    }

    @Test
    public void test1() {
        mat =
                new int[][] {
                    {1, 2, 3, 4, 5},
                    {2, 4, 5, 8, 10},
                    {3, 5, 7, 9, 11},
                    {1, 3, 5, 7, 9}
                };
        assertEquals(5, solution1.smallestCommonElement(mat));
    }
}
