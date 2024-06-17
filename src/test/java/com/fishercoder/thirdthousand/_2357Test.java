package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2357;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2357Test {
    private static _2357.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _2357.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 5, 0, 3, 5};
        assertEquals(3, solution1.minimumOperations(nums));
    }

}