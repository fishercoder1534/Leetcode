package com.fishercoder;

import com.fishercoder.solutions.first_thousand._27;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _27Test {
    private static _27.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _27.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{3, 2, 2, 3};
        assertEquals(2, solution1.removeElement(nums, 3));
    }

    @Test
    public void test2() {
        nums = new int[]{2, 2, 3};
        assertEquals(1, solution1.removeElement(nums, 2));
    }

    @Test
    public void test3() {
        nums = new int[]{1};
        assertEquals(0, solution1.removeElement(nums, 1));
    }
}
