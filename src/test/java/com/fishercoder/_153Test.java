package com.fishercoder;

import com.fishercoder.solutions._153;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _153Test {
    private static _153.Solution1 solution1;
    private static int expected;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _153.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        expected = 0;
        assertEquals(expected, solution1.findMin(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{1};
        expected = 1;
        assertEquals(expected, solution1.findMin(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{2, 1};
        expected = 1;
        assertEquals(expected, solution1.findMin(nums));
    }

    @Test
    public void test4() {
        nums = new int[]{2, 3, 4, 5, 1};
        expected = 1;
        assertEquals(expected, solution1.findMin(nums));
    }

    @Test
    public void test5() {
        nums = new int[]{3, 1, 2};
        expected = 1;
        assertEquals(expected, solution1.findMin(nums));
    }

    @Test
    public void test6() {
        nums = new int[]{3, 4, 5, 1, 2};
        expected = 1;
        assertEquals(expected, solution1.findMin(nums));
    }

    @Test
    public void test7() {
        nums = new int[]{5, 1, 2, 3, 4};
        expected = 1;
        assertEquals(expected, solution1.findMin(nums));
    }
}
