package com.fishercoder;

import com.fishercoder.solutions._1475;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1475Test {
    private static _1475.Solution1 solution1;
    private static int[] prices;

    @BeforeClass
    public static void setup() {
        solution1 = new _1475.Solution1();
    }

    @Test
    public void test1() {
        prices = new int[]{8, 4, 6, 2, 3};
        assertArrayEquals(new int[]{4, 2, 4, 2, 3}, solution1.finalPrices(prices));
    }

}