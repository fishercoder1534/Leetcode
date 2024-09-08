package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._674;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _674Test {
    private _674.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _674.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {1, 3, 5, 4, 7};
        assertEquals(3, solution1.findLengthOfLCIS(nums));
    }

    @Test
    public void test2() {
        nums = new int[] {2, 2, 2, 2, 2};
        assertEquals(1, solution1.findLengthOfLCIS(nums));
    }
}
