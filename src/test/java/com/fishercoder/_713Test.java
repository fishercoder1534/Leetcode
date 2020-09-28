package com.fishercoder;

import com.fishercoder.solutions._713;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _713Test {
    private static _713.Solution1 solution1;
    private static int[] nums;
    private static int k;

    @BeforeClass
    public static void setup() {
        solution1 = new _713.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 3};
        k = 0;
        assertEquals(0, solution1.numSubarrayProductLessThanK(nums, k));
    }

}
