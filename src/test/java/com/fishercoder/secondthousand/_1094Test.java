package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1094;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1094Test {
    private _1094.Solution1 solution1;
    private static int[][] trips;
    private static int capacity;

    @BeforeEach
    public void setup() {
        solution1 = new _1094.Solution1();
    }

    @Test
    public void test1() {
        trips = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[2,1,5],[3,3,7]");
        capacity = 4;
        assertEquals(false, solution1.carPooling(trips, capacity));
    }

    @Test
    public void test2() {
        trips = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[2,1,5],[3,3,7]");
        capacity = 5;
        assertEquals(true, solution1.carPooling(trips, capacity));
    }

    @Test
    public void test3() {
        trips = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[7,5,6],[6,7,8],[10,1,6]");
        capacity = 16;
        assertEquals(false, solution1.carPooling(trips, capacity));
    }
}
