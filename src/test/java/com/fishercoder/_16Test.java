package com.fishercoder;

import com.fishercoder.solutions._16;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _16Test {
    private static _16.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _16.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{-1, 2, 1, -4};
        assertEquals(2, solution1.threeSumClosest(nums, 1));
    }

}