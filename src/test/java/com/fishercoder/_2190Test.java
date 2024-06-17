package com.fishercoder;

import com.fishercoder.solutions.thirdthousand._2190;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2190Test {
    private static _2190.Solution1 solution1;
    private static int[] nums;
    private static int key;

    @BeforeClass
    public static void setup() {
        solution1 = new _2190.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{2, 2, 2, 2, 3};
        key = 2;
        assertEquals(2, solution1.mostFrequent(nums, key));
    }

}