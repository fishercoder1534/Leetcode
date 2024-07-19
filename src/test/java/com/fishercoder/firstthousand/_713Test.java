package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._713;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _713Test {
    private static _713.Solution1 solution1;
    private static int[] nums;
    private static int k;

    @BeforeEach
    public void setup() {
        solution1 = new _713.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 3};
        k = 0;
        assertEquals(0, solution1.numSubarrayProductLessThanK(nums, k));
    }

}
