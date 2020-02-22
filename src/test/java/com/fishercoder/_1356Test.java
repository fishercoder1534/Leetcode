package com.fishercoder;

import com.fishercoder.solutions._1356;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1356Test {
    private static _1356.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1356.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1, 2, 4, 8, 3, 5, 6, 7}, solution1.sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024}, solution1.sortByBits(new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{10000, 10000}, solution1.sortByBits(new int[]{10000, 10000}));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{2, 3, 5, 17, 7, 11, 13, 19}, solution1.sortByBits(new int[]{2, 3, 5, 7, 11, 13, 17, 19}));
    }

    @Test
    public void test5() {
        assertArrayEquals(new int[]{10, 100, 10000, 1000}, solution1.sortByBits(new int[]{10, 100, 1000, 10000}));
    }

}