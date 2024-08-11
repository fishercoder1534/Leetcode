package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._53;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _53Test {
    private _53.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _53.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, solution1.maxSubArray(nums));
    }
}
