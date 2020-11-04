package com.fishercoder;

import com.fishercoder.solutions._757;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _757Test {
    private static _757.Solution solution;
    int[][] intervals;

    @BeforeClass
    public static void setup() {
        solution = new _757.Solution();
    }

    @Test
    public void test1() {
        intervals = new int[][]{{1, 3}, {1, 4}, {2, 5}, {3, 5}};
        assertEquals(3, solution.intersectionSizeTwo(intervals));
    }

    @Test
    public void test2() {
        intervals = new int[][]{{16, 18}, {11, 18}, {15, 23}, {1, 16}, {10, 16}, {6, 19}, {18, 20}, {7, 19}};
        assertEquals(4, solution.intersectionSizeTwo(intervals));
    }
}
