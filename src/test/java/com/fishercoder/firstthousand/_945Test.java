package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._945;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _945Test {
    private static _945.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _945.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{3, 2, 1, 2, 1, 7};
        assertEquals(6, solution1.minIncrementForUnique(nums));
    }

}