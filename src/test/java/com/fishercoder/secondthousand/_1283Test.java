package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1283;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1283Test {
    private _1283.Solution solution;
    private static int[] nums;
    private static int threshold;

    @BeforeEach
    public void setup() {
        solution = new _1283.Solution();
    }

    @Test
    public void test1() {
        nums = new int[] {1, 2, 5, 9};
        threshold = 6;
        assertEquals(5, solution.smallestDivisor(nums, threshold));
    }

    @Test
    public void test2() {
        nums = new int[] {2, 3, 5, 7, 11};
        threshold = 11;
        assertEquals(3, solution.smallestDivisor(nums, threshold));
    }
}
