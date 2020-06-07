package com.fishercoder;

import com.fishercoder.solutions._1471;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1471Test {
    private static _1471.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _1471.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{5, 1}, solution1.getStrongest(nums, 2));
    }

}