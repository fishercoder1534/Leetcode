package com.fishercoder;

import com.fishercoder.solutions._560;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _560Test {
    private static _560.Solution1 solution1;
    private static _560.Solution2 solution2;
    private static int expected;
    private static int actual;
    private static int[] nums;
    private static int k;

    @BeforeClass
    public static void setup() {
        solution1 = new _560.Solution1();
        solution2 = new _560.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 1, 1};
        k = 2;
        expected = 2;
        actual = solution1.subarraySum(nums, k);
        assertEquals(expected, actual);
        actual = solution2.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        nums = new int[]{1, 2, 3};
        k = 3;
        expected = 2;
        actual = solution1.subarraySum(nums, k);
        assertEquals(expected, actual);
        actual = solution2.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        nums = new int[]{1, 1};
        k = 1;
        expected = 2;
        actual = solution1.subarraySum(nums, k);
        assertEquals(expected, actual);
        actual = solution2.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        nums = new int[]{0, 0};
        k = 0;
        expected = 3;
        actual = solution1.subarraySum(nums, k);
        assertEquals(expected, actual);
        actual = solution2.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        nums = new int[]{100, 1, 2, 3, 4};
        k = 3;
        expected = 2;
        actual = solution1.subarraySum(nums, k);
        assertEquals(expected, actual);
        actual = solution2.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

}
