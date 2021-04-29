package com.fishercoder;

import com.fishercoder.solutions._34;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _34Test {
    private static _34.Solution1 solution1;
    private static _34.Solution2 solution2;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _34.Solution1();
        solution2 = new _34.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 3};
        assertArrayEquals(new int[]{1, 1}, solution1.searchRange(nums, 2));
        assertArrayEquals(new int[]{1, 1}, solution2.searchRange(nums, 2));
    }

    @Test
    public void test2() {
        nums = new int[]{};
        assertArrayEquals(new int[]{-1, -1}, solution1.searchRange(nums, 0));
        assertArrayEquals(new int[]{-1, -1}, solution2.searchRange(nums, 0));
    }
}
