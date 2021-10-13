package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._435;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _435Test {
    private static _435.Solution1 solution1;
    private static _435.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _435.Solution1();
        solution2 = new _435.Solution2();
    }

    @Test
    public void test1() {
        int[][] intervals = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2],[2,3],[3,4],[1,3]");
        assertEquals(1, solution1.eraseOverlapIntervals(intervals));
        assertEquals(1, solution2.eraseOverlapIntervals(intervals));
    }

    @Test
    public void test2() {
        int[][] intervals = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[-52,31],[-73,-26],[82,97],[-65,-11],[-62,-49],[95,99],[58,95],[-31,49],[66,98],[-63,2],[30,47],[-40,-26]");
        assertEquals(7, solution1.eraseOverlapIntervals(intervals));
        assertEquals(7, solution2.eraseOverlapIntervals(intervals));
    }

}