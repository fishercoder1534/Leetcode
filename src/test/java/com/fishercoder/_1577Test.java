package com.fishercoder;

import com.fishercoder.solutions._1577;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1577Test {
    private static _1577.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1577.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.numTriplets(new int[]{7, 4}, new int[]{5, 2, 8, 9}));
    }

    @Test
    public void test2() {
        assertEquals(9, solution1.numTriplets(new int[]{1, 1}, new int[]{1, 1, 1}));
    }

    @Test
    public void test3() {
        assertEquals(2, solution1.numTriplets(new int[]{7, 7, 8, 3}, new int[]{1, 2, 9, 7}));
    }

    @Test
    public void test4() {
        assertEquals(0, solution1.numTriplets(new int[]{4, 7, 9, 11, 23}, new int[]{3, 5, 1024, 12, 18}));
    }

    @Test
    public void test5() {
        assertEquals(4, solution1.numTriplets(new int[]{3, 1, 2, 2}, new int[]{1, 3, 4, 4}));
    }

    @Test
    public void test6() {
        assertEquals(5, solution1.numTriplets(new int[]{4, 1, 4, 1, 12}, new int[]{3, 2, 5, 4}));
    }

    @Test
    public void test7() {
        assertEquals(234, solution1.numTriplets(new int[]{14, 1, 1, 12, 7, 12, 10, 4, 11, 10, 5, 2, 5, 14, 7, 9, 10, 13, 15, 6, 9, 12, 6, 12, 4, 10, 9, 12, 11}, new int[]{3, 12, 1, 9, 1, 12, 4, 12, 4, 1, 7, 10, 7, 11, 4, 13, 4, 11, 5, 1, 14, 12, 15, 4, 2, 3, 13, 10, 3, 4}));
    }
}