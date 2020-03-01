package com.fishercoder;

import com.fishercoder.solutions._1365;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1365Test {
    private static _1365.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _1365.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{8, 1, 2, 2, 3};
        assertArrayEquals(new int[]{4, 0, 1, 1, 3}, solution1.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{6, 5, 4, 8};
        assertArrayEquals(new int[]{2, 1, 0, 3}, solution1.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{7, 7, 7, 7};
        assertArrayEquals(new int[]{0, 0, 0, 0}, solution1.smallerNumbersThanCurrent(nums));
    }

}