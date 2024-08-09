package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._724;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _724Test {
    private _724.Solution1 solution1;
    private _724.Solution2 solution2;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _724.Solution1();
        solution2 = new _724.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 7, 3, 6, 5, 6};
        assertEquals(3, solution1.pivotIndex(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{1, 2, 3};
        assertEquals(-1, solution1.pivotIndex(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{-1, -1, -1, 0, 1, 1};
        assertEquals(0, solution1.pivotIndex(nums));
    }

    @Test
    public void test4() {
        nums = new int[]{-1, -1, 0, 1, 1, 0};
        assertEquals(5, solution1.pivotIndex(nums));
    }

    @Test
    public void test5() {
        nums = new int[]{1, 7, 3, 6, 5, 6};
        assertEquals(3, solution2.pivotIndex(nums));
    }

    @Test
    public void test6() {
        nums = new int[]{1, 2, 3};
        assertEquals(-1, solution2.pivotIndex(nums));
    }

    @Test
    public void test7() {
        nums = new int[]{-1, -1, -1, 0, 1, 1};
        assertEquals(0, solution2.pivotIndex(nums));
    }

    @Test
    public void test8() {
        nums = new int[]{-1, -1, 0, 1, 1, 0};
        assertEquals(5, solution2.pivotIndex(nums));
    }
}