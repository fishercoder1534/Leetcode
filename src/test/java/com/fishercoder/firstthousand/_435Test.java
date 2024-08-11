package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._435;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _435Test {
    private _435.Solution1 solution1;
    private _435.Solution2 solution2;

    @BeforeEach
    public void setup() {
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