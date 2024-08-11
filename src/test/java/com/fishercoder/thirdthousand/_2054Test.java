package com.fishercoder.thirdthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.thirdthousand._2054;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2054Test {
    private _2054.Solution1 solution1;
    private static int[][] events;
    private static int expected;

    @BeforeEach
    public void setup() {
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