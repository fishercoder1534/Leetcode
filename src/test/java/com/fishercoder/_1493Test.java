package com.fishercoder;

import com.fishercoder.solutions._1493;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1493Test {
    private static _1493.Solution1 solution1;
    private static _1493.Solution2 solution2;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
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