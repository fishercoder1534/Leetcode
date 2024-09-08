package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._502;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _502Test {
    private _502.Solution1 solution1;
    private static int[] Profits;
    private static int[] Capital;

    @BeforeEach
    public void setup() {
        solution1 = new _502.Solution1();
    }

    @Test
    public void test1() {
        Profits = new int[] {1, 2, 3};
        Capital = new int[] {0, 1, 1};
        assertEquals(4, solution1.findMaximizedCapital(2, 0, Profits, Capital));
    }
}
