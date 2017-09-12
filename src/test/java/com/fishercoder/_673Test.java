package com.fishercoder;

import com.fishercoder.solutions._673;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _673Test {
    private static _673.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _673.Solution1();
    }

    @Test
    @Ignore
    public void test1() {
        nums = new int[]{1, 3, 5, 4, 7};
        assertEquals(2, solution1.findNumberOfLIS(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{2, 2, 2, 2, 2};
        assertEquals(5, solution1.findNumberOfLIS(nums));
    }

}
