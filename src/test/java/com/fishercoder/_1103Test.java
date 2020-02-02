package com.fishercoder;

import com.fishercoder.solutions._1103;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1103Test {
    private static _1103.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1103.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2, 3, 1}, solution1.distributeCandies(7, 4));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{5, 2, 3}, solution1.distributeCandies(10, 3));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 5, 0, 0, 0, 0, 0}, solution1.distributeCandies(600, 40));
    }

}