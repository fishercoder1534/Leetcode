package com.fishercoder;

import com.fishercoder.solutions._209;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _209Test {
    private static _209.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _209.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{2, 3, 1, 2, 4, 3};
        assertEquals(2, solution1.minSubArrayLen(7, nums));
    }

}