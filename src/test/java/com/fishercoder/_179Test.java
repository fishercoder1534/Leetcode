package com.fishercoder;

import com.fishercoder.solutions._1st_thousand._179;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _179Test {
    private static _179.Solution1 solution1;
    private static _179.Solution2 solution2;
    private static int[] nums;
    private static String expected;

    @BeforeClass
    public static void setup() {
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