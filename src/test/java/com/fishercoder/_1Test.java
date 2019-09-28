package com.fishercoder;

import com.fishercoder.solutions._1;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1Test {
    private static _1.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _1.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{2, 7, 11, 15};
        assertArrayEquals(new int[]{0, 1}, solution1.twoSum(nums, 9));
    }

}