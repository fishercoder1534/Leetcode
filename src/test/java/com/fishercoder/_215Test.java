package com.fishercoder;

import com.fishercoder.solutions._1st_thousand._215;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _215Test {
    private static _215.Solution1 solution1;
    private static _215.Solution2 solution2;
    private static _215.Solution3 solution3;
    private static int k;
    private static int[] nums;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _215.Solution1();
        solution2 = new _215.Solution2();
        solution3 = new _215.Solution3();
    }

    @Test
    public void test1() {
        k = 2;
        nums = new int[]{3, 2, 1, 5, 6, 4};
        expected = 5;
        assertEquals(expected, solution1.findKthLargest(nums, k));
        assertEquals(expected, solution2.findKthLargest(nums, k));
        assertEquals(expected, solution3.findKthLargest(nums, k));
    }

    @Test
    public void test2() {
        k = 1;
        nums = new int[]{1};
        expected = 1;
        assertEquals(expected, solution1.findKthLargest(nums, k));
        assertEquals(expected, solution2.findKthLargest(nums, k));
        assertEquals(expected, solution3.findKthLargest(nums, k));
    }

    @Test
    public void test3() {
        k = 2;
        nums = new int[]{2, 1};
        expected = 1;
        assertEquals(expected, solution1.findKthLargest(nums, k));
        assertEquals(expected, solution2.findKthLargest(nums, k));
        assertEquals(expected, solution3.findKthLargest(nums, k));
    }
}
