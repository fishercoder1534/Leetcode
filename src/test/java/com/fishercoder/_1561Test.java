package com.fishercoder;

import com.fishercoder.solutions._1561;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1561Test {
    private static _1561.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1561.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(9, solution1.maxCoins(new int[]{2, 4, 1, 2, 7, 8}));
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.maxCoins(new int[]{2, 4, 5}));
    }

    @Test
    public void test3() {
        assertEquals(18, solution1.maxCoins(new int[]{9, 8, 7, 6, 5, 1, 2, 3, 4}));
    }

}
