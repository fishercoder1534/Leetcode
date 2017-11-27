package com.fishercoder;

import com.fishercoder.solutions._325;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _325Test {
    private static _325.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _325.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{-2, -1, 2, 1};
        assertEquals(2, solution1.maxSubArrayLen(nums, 1));
    }

    @Test
    public void test2() {
        nums = new int[]{1, -1, 5, -2, 3};
        assertEquals(4, solution1.maxSubArrayLen(nums, 3));
    }
}
