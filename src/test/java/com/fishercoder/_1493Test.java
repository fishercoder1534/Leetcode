package com.fishercoder;

import com.fishercoder.solutions._1493;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1493Test {
    private static _1493.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _1493.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 1, 0, 1};
        assertEquals(3, solution1.longestSubarray(nums));
    }

}