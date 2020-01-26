package com.fishercoder;

import com.fishercoder.solutions._1331;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1331Test {
    private static _1331.Solution1 solution1;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1331.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{40, 10, 20, 30};
        assertArrayEquals(new int[]{4, 1, 2, 3}, solution1.arrayRankTransform(arr));
    }

    @Test
    public void test2() {
        arr = new int[]{100, 100, 100};
        assertArrayEquals(new int[]{1, 1, 1}, solution1.arrayRankTransform(arr));
    }

    @Test
    public void test3() {
        arr = new int[]{-1, -3, 100};
        assertArrayEquals(new int[]{2, 1, 3}, solution1.arrayRankTransform(arr));
    }
}