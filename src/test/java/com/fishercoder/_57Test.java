package com.fishercoder;

import com.fishercoder.common.classes.Interval;
import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._57;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _57Test {
    private static _57.Solution1 solution1;
    private static List<Interval> intervals;
    private static List<Interval> expected;
    private static List<Interval> actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _57.Solution1();
    }

    @Test
    public void test1() {
        intervals = new ArrayList<>(Arrays.asList(new Interval(1, 3), new Interval(6, 9)));
        expected = new ArrayList<>(Arrays.asList(new Interval(1, 5), new Interval(6, 9)));
        CommonUtils.printIntervals(intervals);
        actual = solution1.insert(intervals, new Interval(2, 5));
        CommonUtils.printIntervals(actual);
        assertEquals(expected, actual);
    }


    @Test
    public void test2() {
        intervals = new ArrayList<>(Arrays.asList(new Interval(1, 2), new Interval(3, 5), new Interval(6, 7), new Interval(8, 10), new Interval(12, 16)));
        CommonUtils.printIntervals(intervals);
        expected = new ArrayList<>(Arrays.asList(new Interval(1, 2), new Interval(3, 10), new Interval(12, 16)));
        actual = solution1.insert(intervals, new Interval(4, 9));
        CommonUtils.printIntervals(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        intervals = new ArrayList<>(Arrays.asList(new Interval(1, 5)));
        CommonUtils.printIntervals(intervals);
        expected = new ArrayList<>(Arrays.asList(new Interval(1, 5)));
        actual = solution1.insert(intervals, new Interval(2, 3));
        CommonUtils.printIntervals(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        intervals = new ArrayList<>(Arrays.asList());
        CommonUtils.printIntervals(intervals);
        expected = new ArrayList<>(Arrays.asList(new Interval(5, 7)));
        actual = solution1.insert(intervals, new Interval(5, 7));
        CommonUtils.printIntervals(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        intervals = new ArrayList<>(Arrays.asList(new Interval(1, 5)));
        expected = new ArrayList<>(Arrays.asList(new Interval(1, 5), new Interval(6, 8)));
        CommonUtils.printIntervals(intervals);
        actual = solution1.insert(intervals, new Interval(6, 8));
        CommonUtils.printIntervals(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        intervals = new ArrayList<>(Arrays.asList(new Interval(1, 5)));
        expected = new ArrayList<>(Arrays.asList(new Interval(0, 5)));
        CommonUtils.printIntervals(intervals);
        actual = solution1.insert(intervals, new Interval(0, 3));
        CommonUtils.printIntervals(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        intervals = new ArrayList<>(Arrays.asList(new Interval(1, 5)));
        expected = new ArrayList<>(Arrays.asList(new Interval(0, 0), new Interval(1, 5)));
        CommonUtils.printIntervals(intervals);
        actual = solution1.insert(intervals, new Interval(0, 0));
        CommonUtils.printIntervals(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        intervals = new ArrayList<>(Arrays.asList(new Interval(2, 5), new Interval(6, 7), new Interval(8, 9)));
        expected = new ArrayList<>(Arrays.asList(new Interval(0, 1), new Interval(2, 5), new Interval(6, 7), new Interval(8, 9)));
        CommonUtils.printIntervals(intervals);
        actual = solution1.insert(intervals, new Interval(0, 1));
        CommonUtils.printIntervals(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        intervals = new ArrayList<>(Arrays.asList(new Interval(2, 4), new Interval(5, 7), new Interval(8, 10), new Interval(11, 13)));
        expected = new ArrayList<>(Arrays.asList(new Interval(2, 7), new Interval(8, 10), new Interval(11, 13)));
        CommonUtils.printIntervals(intervals);
        actual = solution1.insert(intervals, new Interval(3, 6));
        CommonUtils.printIntervals(actual);
        assertEquals(expected, actual);
    }
}
