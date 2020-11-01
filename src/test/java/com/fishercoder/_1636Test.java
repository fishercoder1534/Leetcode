package com.fishercoder;

import com.fishercoder.solutions._1636;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1636Test {
    private static _1636.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _1636.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 1, 2, 2, 2, 3};
        assertArrayEquals(new int[]{3, 1, 1, 2, 2, 2}, solution1.frequencySort(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{-53, -53, 52, 52, 52, 52, -53, -53, 52, -53, 52, 52, 52, -53, 52, 52, -53, 52, -53, 52, -53, 52, 52, 52, 52, 52, 52, 52, 52, 52, -53, 52, -53, 52, -53, 52, 52, 52, -53, -53, 52, -53, 52, 52, 52, 52, -53, -53, -53, -53, -53, 52, 52, -53, 52, -53, 52, 52, 52};
        assertArrayEquals(new int[]{-53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52}, solution1.frequencySort(nums));
    }

}