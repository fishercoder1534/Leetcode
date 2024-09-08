package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._27;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _27Test {
    private _27.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _27.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {3, 2, 2, 3};
        assertEquals(2, solution1.removeElement(nums, 3));
    }

    @Test
    public void test2() {
        nums = new int[] {2, 2, 3};
        assertEquals(1, solution1.removeElement(nums, 2));
    }

    @Test
    public void test3() {
        nums = new int[] {1};
        assertEquals(0, solution1.removeElement(nums, 1));
    }
}
