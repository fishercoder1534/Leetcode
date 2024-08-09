package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1558;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1558Test {
    private _1558.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _1558.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 5};
        assertEquals(5, solution1.minOperations(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{2, 2};
        assertEquals(3, solution1.minOperations(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{4, 2, 5};
        assertEquals(6, solution1.minOperations(nums));
    }

    @Test
    public void test4() {
        nums = new int[]{3, 2, 2, 4};
        assertEquals(7, solution1.minOperations(nums));
    }

    @Test
    public void test5() {
        nums = new int[]{2, 4, 8, 16};
        assertEquals(8, solution1.minOperations(nums));
    }

}