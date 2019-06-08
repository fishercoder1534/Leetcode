package com.fishercoder;

import com.fishercoder.solutions._523;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _523Test {
    private static _523.Solution1 solution1;
    private static _523.Solution2 solution2;
    private static boolean expected;
    private static int[] nums;
    private static int k;

    @BeforeClass
    public static void setup() {
        solution1 = new _523.Solution1();
        solution2 = new _523.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{23, 2, 4, 6, 7};
        expected = true;
        k = 6;
        assertEquals(expected, solution1.checkSubarraySum(nums, k));
        assertEquals(expected, solution2.checkSubarraySum(nums, k));
    }

    @Test
    public void test2() {
        nums = new int[]{23, 2, 6, 4, 7};
        expected = true;
        k = 6;
        assertEquals(expected, solution1.checkSubarraySum(nums, k));
        assertEquals(expected, solution2.checkSubarraySum(nums, k));
    }

    @Test
    public void test3() {
        nums = new int[]{23, 2, 6, 4, 7};
        expected = false;
        k = 0;
        assertEquals(expected, solution1.checkSubarraySum(nums, k));
        assertEquals(expected, solution2.checkSubarraySum(nums, k));
    }

    @Test
    public void test4() {
        nums = new int[]{0, 1, 0};
        expected = false;
        k = 0;
        assertEquals(expected, solution1.checkSubarraySum(nums, k));
        assertEquals(expected, solution2.checkSubarraySum(nums, k));
    }

    @Test
    public void test5() {
        nums = new int[]{0, 0};
        expected = true;
        k = 0;
        assertEquals(expected, solution1.checkSubarraySum(nums, k));
        assertEquals(expected, solution2.checkSubarraySum(nums, k));
    }

    @Test
    public void test6() {
        nums = new int[]{1, 1};
        expected = true;
        k = 2;
        assertEquals(expected, solution1.checkSubarraySum(nums, k));
        assertEquals(expected, solution2.checkSubarraySum(nums, k));
    }

    @Test
    public void test7() {
        nums = new int[]{0};
        expected = false;
        k = -1;
        assertEquals(expected, solution1.checkSubarraySum(nums, k));
        assertEquals(expected, solution2.checkSubarraySum(nums, k));
    }

    @Test
    public void test8() {
        nums = new int[]{23, 2, 4, 6, 7};
        expected = true;
        k = -6;
        assertEquals(expected, solution1.checkSubarraySum(nums, k));
        assertEquals(expected, solution2.checkSubarraySum(nums, k));
    }

    @Test
    public void test9() {
        nums = new int[]{1, 2, 3};
        expected = false;
        k = 4;
        assertEquals(expected, solution1.checkSubarraySum(nums, k));
        assertEquals(expected, solution2.checkSubarraySum(nums, k));
    }

    @Test
    public void test10() {
        nums = new int[]{5, 2, 4};
        expected = false;
        k = 5;
        assertEquals(expected, solution1.checkSubarraySum(nums, k));
        assertEquals(expected, solution2.checkSubarraySum(nums, k));
    }

}
