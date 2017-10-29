package com.fishercoder;

import com.fishercoder.solutions._719;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _719Test {
    private static _719.Solution1 solution1;
    private static _719.Solution2 solution2;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _719.Solution1();
        solution2 = new _719.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 3, 1};
        assertEquals(0, solution1.smallestDistancePair(nums, 1));
        assertEquals(0, solution2.smallestDistancePair(nums, 1));
    }
}
