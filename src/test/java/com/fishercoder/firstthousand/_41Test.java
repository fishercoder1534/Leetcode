package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._41;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _41Test {
    private _41.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _41.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 0};
        assertEquals(3, solution1.firstMissingPositive(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{};
        assertEquals(1, solution1.firstMissingPositive(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{3, 4, -1, 1};
        assertEquals(2, solution1.firstMissingPositive(nums));
    }

    @Test
    public void test4() {
        nums = new int[]{2};
        assertEquals(1, solution1.firstMissingPositive(nums));
    }
}
