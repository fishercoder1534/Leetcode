package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1128;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1128Test {
    private _1128.Solution1 solution1;
    private static int[][] dominoes;

    @BeforeEach
    public void setup() {
        solution1 = new _1128.Solution1();
    }

    @Test
    public void test1() {
        dominoes =
                new int[][] {
                    {1, 2},
                    {2, 1},
                    {3, 4},
                    {5, 6}
                };
        assertEquals(1, solution1.numEquivDominoPairs(dominoes));
    }
}
