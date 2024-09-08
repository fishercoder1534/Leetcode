package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._325;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _325Test {
    private _325.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _325.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {-2, -1, 2, 1};
        assertEquals(2, solution1.maxSubArrayLen(nums, 1));
    }

    @Test
    public void test2() {
        nums = new int[] {1, -1, 5, -2, 3};
        assertEquals(4, solution1.maxSubArrayLen(nums, 3));
    }
}
