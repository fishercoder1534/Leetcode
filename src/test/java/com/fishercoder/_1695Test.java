package com.fishercoder;

import com.fishercoder.solutions._1695;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1695Test {
    private static _1695.Solution1 solution1;
    private static _1695.Solution2 solution2;
    private static int[] nums;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _1695.Solution1();
        solution2 = new _1695.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{4, 2, 4, 5, 6};
        expected = 17;
        assertEquals(expected, solution1.maximumUniqueSubarray(nums));
        assertEquals(expected, solution2.maximumUniqueSubarray(nums));
    }

}