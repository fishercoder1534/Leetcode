package com.fishercoder;

import com.fishercoder.solutions._1005;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1005Test {
    private static _1005.Solution1 solution1;
    private static _1005.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1005.Solution1();
        solution2 = new _1005.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.largestSumAfterKNegations(new int[]{4, 2, 3}, 1));
        assertEquals(5, solution2.largestSumAfterKNegations(new int[]{4, 2, 3}, 1));
    }

    @Test
    public void test2() {
        assertEquals(6, solution1.largestSumAfterKNegations(new int[]{3, -1, 0, 2}, 3));
        assertEquals(6, solution2.largestSumAfterKNegations(new int[]{3, -1, 0, 2}, 3));
    }

    @Test
    public void test3() {
        assertEquals(13, solution1.largestSumAfterKNegations(new int[]{2, -3, -1, 5, -4}, 2));
        assertEquals(13, solution2.largestSumAfterKNegations(new int[]{2, -3, -1, 5, -4}, 2));
    }

    @Test
    public void test4() {
        assertEquals(22, solution1.largestSumAfterKNegations(new int[]{-8, 3, -5, -3, -5, -2}, 6));
        assertEquals(22, solution2.largestSumAfterKNegations(new int[]{-8, 3, -5, -3, -5, -2}, 6));
    }
}
