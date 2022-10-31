package com.fishercoder;

import com.fishercoder.solutions._35;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _35Test {
    private static _35.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _35.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 3, 5, 6};
        assertEquals(2, solution1.searchInsert(nums, 5));
    }

    @Test
    public void test2() {
        nums = new int[]{1};
        assertEquals(0, solution1.searchInsert(nums, 1));
    }
}
