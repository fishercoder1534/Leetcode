package com.fishercoder;

import com.fishercoder.solutions._31;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _31Test {
    private static _31.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _31.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 3};
        solution1.nextPermutation(nums);
        assertArrayEquals(new int[]{1, 3, 2}, nums);
    }

    @Test
    public void test2() {
        nums = new int[]{1, 2, 4, 6, 3};
        solution1.nextPermutation(nums);
        assertArrayEquals(new int[]{1, 2, 6, 3, 4}, nums);
    }

    @Test
    public void test3() {
        nums = new int[]{1, 2, 4, 6, 3, 2, 1};
        solution1.nextPermutation(nums);
        assertArrayEquals(new int[]{1, 2, 6, 1, 2, 3, 4}, nums);
    }
}
