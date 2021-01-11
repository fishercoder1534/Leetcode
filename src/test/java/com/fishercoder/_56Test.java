package com.fishercoder;

import com.fishercoder.solutions._56;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _56Test {
    private static _56.Solution1 solution1;
    private static int[][] intervals;
    private static int[][] expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _56.Solution1();
    }

    @Test
    public void test1() {
        intervals = new int[][]{
                {2, 3},
                {5, 5},
                {2, 2},
                {3, 4},
                {3, 4}
        };
        expected = new int[][]{
                {2, 4},
                {5, 5}
        };
        assertEquals(expected, solution1.merge(intervals));
    }

}
