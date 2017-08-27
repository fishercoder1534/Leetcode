package com.fishercoder;

import com.fishercoder.solutions._666;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _666Test {
    private static _666.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _666.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{113, 215, 221};
        solution1.totalSum = 0;
        assertEquals(12, solution1.pathSum(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{113, 221};
        solution1.totalSum = 0;
        assertEquals(4, solution1.pathSum(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{113, 214, 221, 348, 487};
        solution1.totalSum = 0;
        assertEquals(26, solution1.pathSum(nums));
    }

}
