package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2134;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2134Test {
    private static _2134.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _2134.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{0, 1, 0, 1, 1, 0, 0};
        assertEquals(1, solution1.minSwaps(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{0, 1, 1, 1, 0, 0, 1, 1, 0};
        assertEquals(2, solution1.minSwaps(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{1, 1, 0, 0, 1};
        assertEquals(0, solution1.minSwaps(nums));
    }

}
