package com.fishercoder;

import com.fishercoder.solutions._698;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _698Test {
    private static _698.Solution1 solution1;
    private static int[] nums;
    private static int k;

    @BeforeClass
    public static void setup() {
        solution1 = new _698.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{4, 3, 2, 3, 5, 2, 1};
        k = 4;
        assertEquals(true, solution1.canPartitionKSubsets(nums, k));
    }

    @Test
    public void test2() {
        nums = new int[]{-1,1,0,0};
        k = 4;
        assertEquals(false, solution1.canPartitionKSubsets(nums, k));
    }
}
