package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._154;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _154Test {
    private _154.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _154.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 1, 1};
        assertEquals(1, solution1.findMin(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{4, 5, 6, 7, 0, 1, 4};
        assertEquals(0, solution1.findMin(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{1, 3, 5};
        assertEquals(1, solution1.findMin(nums));
    }
}
