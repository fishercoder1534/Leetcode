package com.fishercoder;

import com.fishercoder.solutions._1413;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1413Test {
    private static _1413.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _1413.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{-3, 2, -3, 4, 2};
        assertEquals(5, solution1.minStartValue(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{1, 2};
        assertEquals(1, solution1.minStartValue(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{1, -2, -3};
        assertEquals(5, solution1.minStartValue(nums));
    }

}