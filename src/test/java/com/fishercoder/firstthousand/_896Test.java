package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._896;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _896Test {
    private _896.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _896.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {1, 3, 2};
        assertEquals(false, solution1.isMonotonic(nums));
    }

    @Test
    public void test2() {
        nums = new int[] {6, 5, 4, 4};
        assertEquals(true, solution1.isMonotonic(nums));
    }
}
