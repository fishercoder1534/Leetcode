package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1480;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1480Test {
    private _1480.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _1480.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 3, 4};
        assertArrayEquals(new int[]{1, 3, 6, 10}, solution1.runningSum(nums));
    }

}