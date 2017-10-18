package com.fishercoder;

import com.fishercoder.solutions._697;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _697Test {
    private static _697.Solution1 solution1;
    private static _697.Solution2 solution2;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _697.Solution1();
        solution2 = new _697.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{1};
        assertEquals(1, solution1.findShortestSubArray(nums));
        assertEquals(1, solution2.findShortestSubArray(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{1, 2, 2, 3, 1};
        assertEquals(2, solution1.findShortestSubArray(nums));
        assertEquals(2, solution2.findShortestSubArray(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{1, 2, 2, 3, 1, 1};
        assertEquals(6, solution1.findShortestSubArray(nums));
        assertEquals(6, solution2.findShortestSubArray(nums));
    }

    @Test
    public void test4() {
        nums = new int[]{1, 2, 2, 3, 1, 1, 5};
        assertEquals(6, solution1.findShortestSubArray(nums));
        assertEquals(6, solution2.findShortestSubArray(nums));
    }

    @Test
    public void test5() {
        nums = new int[]{1, 2, 2, 3, 1, 4, 2};
        assertEquals(6, solution1.findShortestSubArray(nums));
        assertEquals(6, solution2.findShortestSubArray(nums));
    }

}
