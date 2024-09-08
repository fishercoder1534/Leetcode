package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._673;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class _673Test {
    private _673.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _673.Solution1();
    }

    @Test
    @Disabled
    public void test1() {
        nums = new int[] {1, 3, 5, 4, 7};
        assertEquals(2, solution1.findNumberOfLIS(nums));
    }

    @Test
    public void test2() {
        nums = new int[] {2, 2, 2, 2, 2};
        assertEquals(5, solution1.findNumberOfLIS(nums));
    }
}
