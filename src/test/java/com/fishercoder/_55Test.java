package com.fishercoder;

import com.fishercoder.solutions._55;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _55Test {
    private static _55.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _55.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{0, 2, 3};
        assertEquals(false, solution1.canJump(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{1, 2};
        assertEquals(true, solution1.canJump(nums));
    }

}