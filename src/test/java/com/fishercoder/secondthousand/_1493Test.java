package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1493;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1493Test {
    private _1493.Solution1 solution1;
    private _1493.Solution2 solution2;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _1493.Solution1();
        solution2 = new _1493.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 1, 0, 1};
        assertEquals(3, solution1.longestSubarray(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{1, 1, 0, 1};
        assertEquals(3, solution2.longestSubarray(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1};
        assertEquals(5, solution2.longestSubarray(nums));
    }

}