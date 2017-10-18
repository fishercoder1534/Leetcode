package com.fishercoder;

import com.fishercoder.solutions._34;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _34Test {
    private static _34 test;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        test = new _34();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 3};
        assertArrayEquals(new int[]{1, 1}, test.searchRange(nums, 2));
    }

    @Test
    public void test2() {
        nums = new int[]{};
        assertArrayEquals(new int[]{-1, -1}, test.searchRange(nums, 0));
    }
}
