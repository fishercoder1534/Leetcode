package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._123;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _123Test {
    private _123.Solution1 solution1;
    private static int[] prices;

    @BeforeEach
    public void setUp() {
        solution1 = new _123.Solution1();
    }

    @Test
    public void test1() {
        prices = new int[] {1};
        assertEquals(0, solution1.maxProfit(prices));
    }
}
