package com.fishercoder;

import com.fishercoder.solutions._5453;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _5453Test {
    private static _5453.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _5453.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 3, 4};
        assertArrayEquals(new int[]{1, 3, 6, 10}, solution1.runningSum(nums));
    }

}