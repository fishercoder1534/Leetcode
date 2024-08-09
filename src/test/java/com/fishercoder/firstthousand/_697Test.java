package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._697;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _697Test {
    private _697.Solution1 solution1;
    private _697.Solution2 solution2;
    private _697.Solution3 solution3;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _697.Solution1();
        solution2 = new _697.Solution2();
        solution3 = new _697.Solution3();
    }

    @Test
    public void test1() {
        nums = new int[]{1};
        assertEquals(1, solution1.findShortestSubArray(nums));
        assertEquals(1, solution2.findShortestSubArray(nums));
        assertEquals(1, solution3.findShortestSubArray(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{1, 2, 2, 3, 1};
        assertEquals(2, solution1.findShortestSubArray(nums));
        assertEquals(2, solution2.findShortestSubArray(nums));
        assertEquals(2, solution3.findShortestSubArray(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{1, 2, 2, 3, 1, 1};
        assertEquals(6, solution1.findShortestSubArray(nums));
        assertEquals(6, solution2.findShortestSubArray(nums));
        assertEquals(6, solution3.findShortestSubArray(nums));
    }

    @Test
    public void test4() {
        nums = new int[]{1, 2, 2, 3, 1, 1, 5};
        assertEquals(6, solution1.findShortestSubArray(nums));
        assertEquals(6, solution2.findShortestSubArray(nums));
        assertEquals(6, solution3.findShortestSubArray(nums));
    }

    @Test
    public void test5() {
        nums = new int[]{1, 2, 2, 3, 1, 4, 2};
        assertEquals(6, solution1.findShortestSubArray(nums));
        assertEquals(6, solution2.findShortestSubArray(nums));
        assertEquals(6, solution3.findShortestSubArray(nums));
    }

}
