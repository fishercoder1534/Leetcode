package com.fishercoder;

import com.fishercoder.solutions._1st_thousand._34;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _34Test {
    private static _34.Solution1 solution1;
    private static _34.Solution2 solution2;
    private static _34.Solution3 solution3;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _34.Solution1();
        solution2 = new _34.Solution2();
        solution3 = new _34.Solution3();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 3};
        assertArrayEquals(new int[]{1, 1}, solution1.searchRange(nums, 2));
        assertArrayEquals(new int[]{1, 1}, solution2.searchRange(nums, 2));
        assertArrayEquals(new int[]{1, 1}, solution3.searchRange(nums, 2));
    }

    @Test
    public void test2() {
        nums = new int[]{};
        assertArrayEquals(new int[]{-1, -1}, solution1.searchRange(nums, 0));
        assertArrayEquals(new int[]{-1, -1}, solution2.searchRange(nums, 0));
        assertArrayEquals(new int[]{-1, -1}, solution3.searchRange(nums, 0));
    }
}
