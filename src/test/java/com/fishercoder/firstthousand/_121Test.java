package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._121;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _121Test {
    private _121.Solution1 solution1;
    private _121.Solution2 solution2;
    private static int[] prices;

    @BeforeEach
    public void setup() {
        solution1 = new _121.Solution1();
        solution2 = new _121.Solution2();
    }

    @Test
    public void test1() {
        prices = new int[] {7, 1, 5, 3, 6, 4};
        assertEquals(5, solution1.maxProfit(prices));
        assertEquals(5, solution2.maxProfit(prices));
    }

    @Test
    public void test2() {
        prices = new int[] {7, 6, 4, 3, 1};
        assertEquals(0, solution1.maxProfit(prices));
        assertEquals(0, solution2.maxProfit(prices));
    }

    @Test
    public void test3() {
        prices = new int[] {2, 4, 1};
        assertEquals(2, solution1.maxProfit(prices));
        assertEquals(2, solution2.maxProfit(prices));
    }

    @Test
    public void test4() {
        prices = new int[] {1, 2};
        assertEquals(1, solution1.maxProfit(prices));
        assertEquals(1, solution2.maxProfit(prices));
    }
}
