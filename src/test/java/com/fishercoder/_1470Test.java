package com.fishercoder;

import com.fishercoder.solutions._1470;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1470Test {
    private static _1470.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _1470.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{2, 5, 1, 3, 4, 7};
        assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, solution1.shuffle(nums, 3));
    }

}