package com.fishercoder;

import com.fishercoder.solutions._674;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _674Test {
    private static _674.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _674.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 3, 5, 4, 7};
        assertEquals(3, solution1.findLengthOfLCIS(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{2, 2, 2, 2, 2};
        assertEquals(1, solution1.findLengthOfLCIS(nums));
    }

}
