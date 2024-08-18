package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._714;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _714Test {
    private _714.Solution1 solution1;
    private _714.Solution2 solution2;
    private static int[] prices;
    private static int fee;

    @BeforeEach
    public void setup() {
        solution1 = new _714.Solution1();
        solution2 = new _714.Solution2();
    }

    @Test
    public void test1() {
        prices = new int[] {1, 3, 2, 8, 4, 9};
        fee = 2;
        assertEquals(8, solution1.maxProfit(prices, fee));
        assertEquals(8, solution2.maxProfit(prices, fee));
    }

    @Test
    public void test2() {
        prices = new int[] {1, 3, 7, 5, 10, 3};
        fee = 3;
        assertEquals(6, solution1.maxProfit(prices, fee));
        assertEquals(6, solution2.maxProfit(prices, fee));
    }

    @Test
    public void test3() {
        prices = new int[] {1, 4, 6, 2, 8, 3, 10, 14};
        fee = 3;
        assertEquals(13, solution1.maxProfit(prices, fee));
        assertEquals(13, solution2.maxProfit(prices, fee));
    }
}
