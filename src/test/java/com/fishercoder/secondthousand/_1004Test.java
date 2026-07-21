package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1004;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1004Test {
    private _1004.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _1004.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        assertEquals(6, solution1.longestOnes(nums, 2));
    }

    @Test
    public void test2() {
        nums = new int[] {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        assertEquals(10, solution1.longestOnes(nums, 3));
    }
}
