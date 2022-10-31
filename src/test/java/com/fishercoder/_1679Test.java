package com.fishercoder;

import com.fishercoder.solutions._1679;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1679Test {
    private static _1679.Solution1 solution1;
    private static int[] nums;
    private static int k;

    @BeforeClass
    public static void setup() {
        solution1 = new _1679.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2};
        k = 3;
        assertEquals(4, solution1.maxOperations(nums, k));
    }

}