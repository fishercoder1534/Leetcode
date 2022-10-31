package com.fishercoder;

import com.fishercoder.solutions._2080;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2080Test {
    private static _2080.Solution1.RangeFreqQuery rangeFreqQuery1;
    private static _2080.Solution2.RangeFreqQuery rangeFreqQuery2;

    @Test
    public void test1() {
        rangeFreqQuery1 = new _2080.Solution1.RangeFreqQuery(new int[]{12, 33, 4, 56, 22, 2, 34, 33, 22, 12, 34, 56});
        assertEquals(1, rangeFreqQuery1.query(1, 2, 4));
        assertEquals(2, rangeFreqQuery1.query(0, 11, 33));

        rangeFreqQuery2 = new _2080.Solution2.RangeFreqQuery(new int[]{12, 33, 4, 56, 22, 2, 34, 33, 22, 12, 34, 56});
        assertEquals(1, rangeFreqQuery2.query(1, 2, 4));
        assertEquals(2, rangeFreqQuery2.query(0, 11, 33));
    }

    @Test
    public void test2() {
        rangeFreqQuery1 = new _2080.Solution1.RangeFreqQuery(new int[]{1, 1, 1, 2, 2});
        assertEquals(0, rangeFreqQuery1.query(0, 1, 2));
        assertEquals(3, rangeFreqQuery1.query(0, 2, 1));
        assertEquals(1, rangeFreqQuery1.query(3, 3, 2));
        assertEquals(1, rangeFreqQuery1.query(2, 2, 1));

        rangeFreqQuery2 = new _2080.Solution2.RangeFreqQuery(new int[]{1, 1, 1, 2, 2});
        assertEquals(0, rangeFreqQuery2.query(0, 1, 2));
        assertEquals(3, rangeFreqQuery2.query(0, 2, 1));
        assertEquals(1, rangeFreqQuery2.query(3, 3, 2));
        assertEquals(1, rangeFreqQuery2.query(2, 2, 1));
    }

    @Test
    public void test3() {
        rangeFreqQuery1 = new _2080.Solution1.RangeFreqQuery(new int[]{3, 4, 5, 3, 3, 2, 2, 2, 5, 4});
        assertEquals(2, rangeFreqQuery1.query(2, 6, 3));
        assertEquals(0, rangeFreqQuery1.query(5, 6, 5));
        assertEquals(2, rangeFreqQuery1.query(1, 6, 2));
        assertEquals(1, rangeFreqQuery1.query(0, 2, 3));
        assertEquals(0, rangeFreqQuery1.query(5, 6, 4));

        rangeFreqQuery2 = new _2080.Solution2.RangeFreqQuery(new int[]{3, 4, 5, 3, 3, 2, 2, 2, 5, 4});
        assertEquals(2, rangeFreqQuery2.query(2, 6, 3));
        assertEquals(0, rangeFreqQuery2.query(5, 6, 5));
        assertEquals(2, rangeFreqQuery2.query(1, 6, 2));
        assertEquals(1, rangeFreqQuery2.query(0, 2, 3));
        assertEquals(0, rangeFreqQuery2.query(5, 6, 4));
    }

}