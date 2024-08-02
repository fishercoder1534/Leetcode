package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2134;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2134Test {
    private static _2134.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _2134.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{0, 1, 0, 1, 1, 0, 0};
        assertEquals(1, solution1.minSwaps(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{0, 1, 1, 1, 0, 0, 1, 1, 0};
        assertEquals(2, solution1.minSwaps(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{1, 1, 0, 0, 1};
        assertEquals(0, solution1.minSwaps(nums));
    }

}
