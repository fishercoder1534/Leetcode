package com.fishercoder;

import com.fishercoder.solutions._26;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _26Test {
    private static _26.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _26.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 1, 2};
        assertEquals(2, solution1.removeDuplicates(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{1, 1, 2, 2, 3};
        assertEquals(3, solution1.removeDuplicates(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{1, 1};
        assertEquals(1, solution1.removeDuplicates(nums));
    }
}
