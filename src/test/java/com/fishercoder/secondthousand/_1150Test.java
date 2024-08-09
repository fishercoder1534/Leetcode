package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1150;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1150Test {
    private _1150.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _1150.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{2, 4, 5, 5, 5, 5, 5, 6, 6};
        assertEquals(true, solution1.isMajorityElement(nums, 5));
    }

    @Test
    public void test2() {
        nums = new int[]{10, 100, 101, 101};
        assertEquals(false, solution1.isMajorityElement(nums, 101));
    }

    @Test
    public void test3() {
        nums = new int[]{1, 1, 1, 2, 3, 3, 3};
        assertEquals(false, solution1.isMajorityElement(nums, 2));
    }

}