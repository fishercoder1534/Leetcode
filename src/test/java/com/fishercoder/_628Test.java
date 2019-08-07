package com.fishercoder;

import com.fishercoder.solutions._628;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _628Test {
    private static _628.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _628.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 3};
        assertEquals(6, solution1.maximumProduct(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{1, 2, 3, 4};
        assertEquals(24, solution1.maximumProduct(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{-4, -3, -2, -1, 60};
        assertEquals(720, solution1.maximumProduct(nums));
    }

}