package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._1;
import com.fishercoder.solutions._2054;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class _2054Test {
    private static _2054.Solution1 solution1;
    private static int[][] events;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _2054.Solution1();
    }

    @Test
    public void test1() {
        events = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,3,2],[4,5,2],[2,4,3]");
        expected = 4;
        assertEquals(expected, solution1.maxTwoEvents(events));
    }

    @Test
    public void test2() {
        events = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,3,2],[4,5,2],[1,5,5]");
        expected = 5;
        assertEquals(expected, solution1.maxTwoEvents(events));
    }

    @Test
    public void test3() {
        events = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,5,3],[1,5,1],[6,6,5]");
        expected = 8;
        assertEquals(expected, solution1.maxTwoEvents(events));
    }


}