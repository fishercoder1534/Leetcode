package com.fishercoder;

import com.fishercoder.solutions._128;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _128Test {
    private static _128.Solution3 solution3;
    private static _128.Solution4 solution4;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution3 = new _128.Solution3();
        solution4 = new _128.Solution4();
    }

    @Test
    public void test1() {
        nums = new int[]{100, 4, 200, 1, 3, 2};
        assertEquals(4, solution3.longestConsecutive(nums));
        assertEquals(4, solution4.longestConsecutive(nums));
    }
}
