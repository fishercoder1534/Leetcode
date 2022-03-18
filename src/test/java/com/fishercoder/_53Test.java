package com.fishercoder;

import com.fishercoder.solutions._53;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _53Test {
    private static _53.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _53.Solution1();
    }

    @Before
    public void clear() {
        solution1 = new _53.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, solution1.maxSubArray(nums));
    }
}
