package com.fishercoder;

import com.fishercoder.solutions.first_thousand._26;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _26Test {
    private static _26.Solution1 solution1;
    private static _26.Solution2 solution2;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _26.Solution1();
        solution2 = new _26.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 1, 2};
        assertEquals(2, solution1.removeDuplicates(nums));
        assertEquals(2, solution2.removeDuplicates(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{1, 1, 2, 2, 3};
        assertEquals(3, solution1.removeDuplicates(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{1, 1};
        assertEquals(1, solution1.removeDuplicates(nums));
    }
}
