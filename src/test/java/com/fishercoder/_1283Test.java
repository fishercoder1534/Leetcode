package com.fishercoder;

import com.fishercoder.solutions._1283;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1283Test {
    private static _1283.Solution solution;
    private static int[] nums;
    private static int threshold;

    @BeforeClass
    public static void setup() {
        solution = new _1283.Solution();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 5, 9};
        threshold = 6;
        assertEquals(5, solution.smallestDivisor(nums, threshold));
    }

    @Test
    public void test2() {
        nums = new int[]{2, 3, 5, 7, 11};
        threshold = 11;
        assertEquals(3, solution.smallestDivisor(nums, threshold));
    }
}
