package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._16;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _16Test {
    private _16.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _16.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{-1, 2, 1, -4};
        assertEquals(2, solution1.threeSumClosest(nums, 1));
    }

}