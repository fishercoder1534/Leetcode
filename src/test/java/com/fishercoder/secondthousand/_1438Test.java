package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1438;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1438Test {
    private _1438.Solution1 solution1;
    private static int[] nums;
    private static int limit;
    private static int expected;

    @BeforeEach
    public void setup() {
        solution1 = new _1438.Solution1();
    }

    @Test
    public void test1() {
        expected = 2;
        nums = new int[]{8, 2, 4, 7};
        limit = 4;
        assertEquals(expected, solution1.longestSubarray(nums, limit));
    }

    @Test
    public void test2() {
        expected = 4;
        nums = new int[]{10, 1, 2, 4, 7, 2};
        limit = 5;
        assertEquals(expected, solution1.longestSubarray(nums, limit));
    }

    @Test
    public void test3() {
        expected = 3;
        nums = new int[]{4, 2, 2, 2, 4, 4, 2, 2};
        limit = 0;
        assertEquals(expected, solution1.longestSubarray(nums, limit));
    }

}
