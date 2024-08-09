package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._179;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _179Test {
    private _179.Solution1 solution1;
    private _179.Solution2 solution2;
    private static int[] nums;
    private static String expected;

    @BeforeEach
    public void setup() {
        solution1 = new _179.Solution1();
        solution2 = new _179.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{34323, 3432};
        expected = "343234323";
        assertEquals(expected, solution1.largestNumber(nums));
        assertEquals(expected, solution2.largestNumber(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{111311, 1113};
        expected = "1113111311";
        assertEquals(expected, solution1.largestNumber(nums));
        assertEquals(expected, solution2.largestNumber(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{3, 30, 34, 5, 9};
        expected = "9534330";
        assertEquals(expected, solution1.largestNumber(nums));
        assertEquals(expected, solution2.largestNumber(nums));
    }

    @Test
    public void test4() {
        nums = new int[]{0, 0};
        expected = "0";
        assertEquals(expected, solution1.largestNumber(nums));
        assertEquals(expected, solution2.largestNumber(nums));
    }

}