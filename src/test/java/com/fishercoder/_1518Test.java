package com.fishercoder;

import com.fishercoder.solutions._1518;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1518Test {
    private static _1518.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1518.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(13, solution1.numWaterBottles(9, 3));
    }

    @Test
    public void test2() {
        assertEquals(19, solution1.numWaterBottles(15, 4));
    }

    @Test
    public void test3() {
        assertEquals(6, solution1.numWaterBottles(5, 5));
    }

}