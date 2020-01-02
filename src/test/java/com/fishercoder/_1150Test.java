package com.fishercoder;

import com.fishercoder.solutions._1150;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1150Test {
    private static _1150.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _1150.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{2, 4, 5, 5, 5, 5, 5, 6, 6};
        assertEquals(true, solution1.isMajorityElement(nums, 5));
    }

    @Test
    public void test2() {
        nums = new int[]{10, 100, 101, 101};
        assertEquals(false, solution1.isMajorityElement(nums, 101));
    }

    @Test
    public void test3() {
        nums = new int[]{1, 1, 1, 2, 3, 3, 3};
        assertEquals(false, solution1.isMajorityElement(nums, 2));
    }

}