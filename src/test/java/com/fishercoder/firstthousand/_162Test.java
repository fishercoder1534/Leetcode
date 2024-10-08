package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._162;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _162Test {
    private _162.Solution1 solution1;
    private _162.Solution2 solution2;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _162.Solution1();
        solution2 = new _162.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[] {1, 2};
        assertEquals(1, solution1.findPeakElement(nums));
        assertEquals(1, solution2.findPeakElement(nums));
    }

    @Test
    public void test2() {
        nums = new int[] {1};
        assertEquals(0, solution1.findPeakElement(nums));
        assertEquals(0, solution2.findPeakElement(nums));
    }

    @Test
    public void test3() {
        nums = new int[] {1, 2, 3, 1};
        assertEquals(2, solution1.findPeakElement(nums));
        assertEquals(2, solution2.findPeakElement(nums));
    }

    @Test
    public void test4() {
        nums = new int[] {1, 2, 1, 3, 5, 6, 4};
        assertEquals(5, solution1.findPeakElement(nums));
        assertEquals(1, solution2.findPeakElement(nums));
    }
}
