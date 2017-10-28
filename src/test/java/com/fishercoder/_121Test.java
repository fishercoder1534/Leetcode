package com.fishercoder;

import com.fishercoder.solutions._121;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _121Test {
    private static _121 test;
    private static int[] prices;

    @BeforeClass
    public static void setup() {
        test = new _121();
    }

    @Test
    public void test1() {
        prices = new int[]{7, 1, 5, 3, 6, 4};
        assertEquals(5, test.maxProfit(prices));
    }

    @Test
    public void test2() {
        prices = new int[]{7, 6, 4, 3, 1};
        assertEquals(0, test.maxProfit(prices));
    }

    @Test
    public void test3() {
        prices = new int[]{2, 4, 1};
        assertEquals(2, test.maxProfit(prices));
    }

    @Test
    public void test4() {
        prices = new int[]{1, 2};
        assertEquals(1, test.maxProfit(prices));
    }

}