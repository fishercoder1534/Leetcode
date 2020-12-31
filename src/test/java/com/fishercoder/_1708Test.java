package com.fishercoder;

import com.fishercoder.solutions._1708;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1708Test {
    private static _1708.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1708.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{5, 2, 3}, solution1.largestSubarray(new int[]{1, 4, 5, 2, 3}, 3));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{5}, solution1.largestSubarray(new int[]{1, 4, 5, 2, 3}, 1));
    }

}