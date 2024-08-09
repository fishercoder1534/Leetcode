package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._35;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _35Test {
    private _35.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _35.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 3, 5, 6};
        assertEquals(2, solution1.searchInsert(nums, 5));
    }

    @Test
    public void test2() {
        nums = new int[]{1};
        assertEquals(0, solution1.searchInsert(nums, 1));
    }
}
