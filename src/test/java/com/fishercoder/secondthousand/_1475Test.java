package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1475;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1475Test {
    private _1475.Solution1 solution1;
    private static int[] prices;

    @BeforeEach
    public void setup() {
        solution1 = new _1475.Solution1();
    }

    @Test
    public void test1() {
        prices = new int[]{8, 4, 6, 2, 3};
        assertArrayEquals(new int[]{4, 2, 4, 2, 3}, solution1.finalPrices(prices));
    }

}