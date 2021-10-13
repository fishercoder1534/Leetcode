package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
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
        int[][] intervals = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2],[2,3],[3,4],[1,3]");
        assertEquals(1, solution1.eraseOverlapIntervals(intervals));
    }

}