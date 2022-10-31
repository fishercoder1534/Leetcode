package com.fishercoder;

import com.fishercoder.solutions._1862;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1862Test {
    private static _1862.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1862.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(49, solution1.sumOfFlooredPairs(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }

    @Test
    public void test2() {
        assertEquals(10, solution1.sumOfFlooredPairs(new int[]{2, 5, 9}));
    }

    @Test
    public void test3() {
        assertEquals(17, solution1.sumOfFlooredPairs(new int[]{4, 3, 4, 3, 5}));
    }

}