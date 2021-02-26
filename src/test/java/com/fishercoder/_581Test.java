package com.fishercoder;

import com.fishercoder.solutions._581;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _581Test {
    private static _581.Solution1 solution1;
    private static _581.Solution2 solution2;
    private static _581.Solution3 solution3;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _581.Solution1();
        solution2 = new _581.Solution2();
        solution3 = new _581.Solution3();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 3, 4};
        assertEquals(0, solution1.findUnsortedSubarray(nums));
        assertEquals(0, solution2.findUnsortedSubarray(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{2, 6, 4, 8, 10, 9, 15};
        assertEquals(5, solution1.findUnsortedSubarray(nums));
        assertEquals(5, solution2.findUnsortedSubarray(nums));
    }
}
