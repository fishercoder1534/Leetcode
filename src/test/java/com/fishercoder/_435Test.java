package com.fishercoder;

import com.fishercoder.solutions._435;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _435Test {
    private static _435.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _435.Solution1();
    }

    @Test
    public void test1() {
        int[][] intervals = new int[][]{new int[]{1, 100}, new int[]{11, 22}, new int[]{1, 11}, new int[]{2, 12}};
        assertEquals(2, solution1.eraseOverlapIntervals(intervals));
    }

}