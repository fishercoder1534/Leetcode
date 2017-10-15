package com.fishercoder;

import com.fishercoder.solutions._697;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _697Test {
    private static _697.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _697.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1};
        assertEquals(1, solution1.findShortestSubArray(nums));
    }

}
