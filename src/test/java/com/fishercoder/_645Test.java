package com.fishercoder;

import com.fishercoder.solutions._645;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _645Test {
    private static _645.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _645.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 2, 4};
        assertArrayEquals(new int[]{2, 3}, solution1.findErrorNums(nums));
    }
}
