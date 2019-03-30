package com.fishercoder;

import com.fishercoder.common.classes.Interval;
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
        Interval[] intervals = new Interval[3];
        intervals[0] = new Interval(3, 4);
        intervals[1] = new Interval(2, 3);
        intervals[2] = new Interval(1, 2);
        solution1.findRightInterval(intervals);
    }

    @Test
    public void test2() {
        Interval[] intervals = new Interval[3];
        intervals[0] = new Interval(1, 4);
        intervals[1] = new Interval(2, 3);
        intervals[2] = new Interval(3, 4);
        solution1.findRightInterval(intervals);
    }
}