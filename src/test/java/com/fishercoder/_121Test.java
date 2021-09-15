package com.fishercoder;

import com.fishercoder.solutions._121;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _121Test {
    private static _121.Solution1 solution1;
    private static _121.Solution2 solution2;
    private static int[] prices;

    @BeforeClass
    public static void setup() {
        solution1 = new _121.Solution1();
        solution2 = new _121.Solution2();
    }

    @Test
    public void test1() {
        prices = new int[]{7, 1, 5, 3, 6, 4};
        assertEquals(5, solution1.maxProfit(prices));
        assertEquals(5, solution2.maxProfit(prices));
    }

    @Test
    public void test2() {
        prices = new int[]{7, 6, 4, 3, 1};
        assertEquals(0, solution1.maxProfit(prices));
        assertEquals(0, solution2.maxProfit(prices));
    }

    @Test
    public void test3() {
        prices = new int[]{2, 4, 1};
        assertEquals(2, solution1.maxProfit(prices));
        assertEquals(2, solution2.maxProfit(prices));
    }

    @Test
    public void test4() {
        prices = new int[]{1, 2};
        assertEquals(1, solution1.maxProfit(prices));
        assertEquals(1, solution2.maxProfit(prices));
    }
}
