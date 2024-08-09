package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._416;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _416Test {
    private _416.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _416.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 5, 11, 5};
        assertEquals(true, solution1.canPartition(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{1, 2, 3, 5};
        assertEquals(false, solution1.canPartition(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertEquals(true, solution1.canPartition(nums));
    }

}

