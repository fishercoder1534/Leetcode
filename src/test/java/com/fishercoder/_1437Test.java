package com.fishercoder;

import com.fishercoder.solutions._1437;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1437Test {
    private static _1437.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _1437.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 0, 0, 0, 1, 0, 0, 1};
        assertEquals(true, solution1.kLengthApart(nums, 2));
    }

}