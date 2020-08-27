package com.fishercoder;

import com.fishercoder.solutions._436;
import org.junit.BeforeClass;
import org.junit.Test;

public class _436Test {
    private static _436.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _436.Solution1();
    }

    @Test
    public void test1() {
        int[][] intervals = new int[][]{
                {3, 4},
                {2, 3},
                {1, 2}
        };
        solution1.findRightInterval(intervals);
    }

    @Test
    public void test2() {
        int[][] intervals = new int[][]{
                {1, 4},
                {2, 3},
                {3, 4}
        };
        solution1.findRightInterval(intervals);
    }
}